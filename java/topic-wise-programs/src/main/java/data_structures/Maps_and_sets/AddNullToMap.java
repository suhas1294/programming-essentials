package data_structures.Maps_and_sets;

import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;

public class AddNullToMap {
    public static void main(String[] args) throws URISyntaxException {
        Map map1 = new LinkedHashMap();
        Map map2 = new LinkedHashMap();

        map1.put("a", 1);
        map1.put("b", 2);
        map2.put("c", 3);
        map2.put("d", 4);
        map1.put("asd", null);

        map1.putAll(map2);
        System.out.println(map1);
    }
}
