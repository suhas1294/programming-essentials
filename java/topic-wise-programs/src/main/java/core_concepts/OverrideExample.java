package core_concepts;

import java.util.*;

class OverrideExample {
    public String someMethod1(){
        return "qwertyuio";
    }
}

class SomeExample extends OverrideExample{
    @Override
    public String someMethod1() {
        return "true";
    }

    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("z");
        list.add("x");
        list.add("m");
        list.add(2, "xx");
        System.out.println(list.get(2));
        List alist = new ArrayList();
        alist.add("1");
        alist.add("2");
        alist.add("5");
        alist.add("6");

    }
}
