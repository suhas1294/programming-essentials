package data_structures.Maps_and_sets;

import java.util.*;

public class MapTypes {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        hashMap.put("y", "24");
        hashMap.put("z", "26");
        hashMap.put("x", "25");

        linkedHashMap.put("z", "26");
        linkedHashMap.put("x", "25");
        linkedHashMap.put("y", "24");
        
        treeMap.put("z", "26");
        treeMap.put("x", "25");
        treeMap.put("y", "24");

        System.out.println("Hashmap:");
        printMap(hashMap);
        System.out.println("Linked HashMap:");
        printMap(linkedHashMap);
        System.out.println("Tree Map:");
        printMap(treeMap);
    }
    
    private static void printMap(Map map){
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> pair = it.next();
            System.out.println(String.format("Key: %s, value: %s", pair.getKey(), pair.getValue()));
        }
        System.out.println("***********************");
    } 
}
