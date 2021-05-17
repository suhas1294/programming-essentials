package sorting;

import java.util.TreeMap;

public class AlfaSortTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.put("Lol", 1);
        treeMap.put("Marc", 2);
        treeMap.put("Jesper", 3);
        treeMap.put("lol1", 1);
        treeMap.put("marc1", 2);
        treeMap.put("jesper1", 3);
        treeMap.put("asula", 3);
        System.out.println(treeMap);
        System.out.println('d' - 'a');
    }
}
