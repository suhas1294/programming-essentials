package data_structures.Maps_and_sets;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapExp {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        List<Integer> number = Arrays.asList(2,3,4,5);
        List square = number.stream().map(x->(x*x)).collect(Collectors.toList());
        System.out.println(square);

        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List filteredResult = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        List sortedResult = names.stream().sorted().collect(Collectors.toList());
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(filteredResult);
        System.out.println(sortedResult);
        System.out.println(even);

        Map result = new LinkedHashMap();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
        System.out.println(result);
    }
}
