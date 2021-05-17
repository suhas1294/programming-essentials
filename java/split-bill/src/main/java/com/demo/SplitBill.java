package com.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
class Event{
    private String name;
    private int totalAmt;
    private int sharableAmt;

    // As soon as event is created, All user's 'amount' property will be updated with latest sharable amount
    public Event(String name, Map transaction){
        this.name = name;
        // updating total amt for this event
        Iterator<Map.Entry<Person, Integer>> it = transaction.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Person, Integer> pair = it.next();
            this.totalAmt += pair.getValue();
        }

        // updating sharable amount for each person
        sharableAmt = totalAmt / transaction.size();

        System.out.println(String.format("Total amount for the event '%s':\t%d", name, totalAmt));
        System.out.println(String.format("Sharable amount(per head) for the event '%s':\t%d", name, sharableAmt));
        System.out.println("Re-calculating the new amount of the user after new event's transaction");

        // updating sharable amount for each person : if its positive, then he owes money
        Iterator<Map.Entry<Person, Integer>> it1 = transaction.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry<Person, Integer> pair = it1.next();
            Person person = pair.getKey();
            int amt = person.getAmt() + (sharableAmt - pair.getValue());
            person.setAmt(amt);
            System.out.println(String.format("%s : %d", person.getName(), person.getAmt()));
        }
        System.out.println("******************\n");
    }
}

@Getter
@Setter
class Person implements Comparable<Person>{
    private String name;
    private int amt;

    public Person(String name){
        this.name = name;
    }

    // to list persons in the increasing order of their amount(sharable)
    @Override
    public int compareTo(Person otherPerson) {
        return (this.getAmt()-otherPerson.getAmt());
    }
}

public class SplitBill {
    public static void main(String[] args) {

        Person a = new Person("a");
        Person b = new Person("b");
        Person c = new Person("C");
        Person d = new Person("d");

        Map<Person, Integer> transaction1 = new HashMap();
        transaction1.put(a, 400);
        transaction1.put(b, 1000);
        transaction1.put(c, 100);
        transaction1.put(d, 900);

        Event event1 = new Event("rent", transaction1);

        // **************************************

        Map<Person, Integer> transaction2 = new HashMap();
        transaction2.put(a, 1100);
        transaction2.put(b, 700);
        transaction2.put(c, 400);
        transaction2.put(d, 600);

        Event event2 = new Event("transport", transaction2);

        // ******************************

        Set<Person> group = new HashSet<>();
        group.add(a);
        group.add(b);
        group.add(c);
        group.add(d);

        // main logic
        settle(group);

        // balance after settling down the amounts:
        System.out.println("\n******** Final Balance ********");
        for (Person person: group) {
            System.out.println(person.getName() + "\t" + person.getAmt());
        }
    }

    public static void settle(Set<Person> group) {
        List<Person> givers = new ArrayList<>();
        List<Person> takers = new ArrayList<>();

        // Segregating the persons as givers and takers
        for (Person person : group) {
            if (person.getAmt() >= 0) {
                givers.add(person);
            }else {
                takers.add(person);
            }
        }

        // sorting givers in the increasing order of money owed by them.
        Collections.sort(givers);

        System.out.println("Starting settling process...");
        for (Person giver: givers) {
            for (Person taker: takers) {
                if ((giver.getAmt() + taker.getAmt()) < 0){
                    System.out.println(String.format("%s wanted %d, %s payed his full capcity %d, still %s is short of %d", taker.getName(), taker.getAmt(), giver.getName(), giver.getAmt(), taker.getName(), (taker.getAmt() + giver.getAmt())));
                    taker.setAmt(taker.getAmt() + giver.getAmt());
                    giver.setAmt(0);
                }else  if((giver.getAmt() + taker.getAmt()) == 0){
                    System.out.println(String.format("%s wanted %d, %s also left with %d, so neutralized", taker.getName(), taker.getAmt(), giver.getName(), giver.getAmt()));
                    giver.setAmt(0);
                    taker.setAmt(0);
                }else {
                    int payable = giver.getAmt() + taker.getAmt();
                    System.out.println(String.format("%s pays %d to %s", giver.getName(), taker.getAmt(), taker.getName()));
                    taker.setAmt(0);
                    giver.setAmt(payable);
                }
            }
        }
    }
}
