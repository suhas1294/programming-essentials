package data_structures.Maps_and_sets;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapEntryDemo{
    public static void main(String[] args)
    {
        // Create a LinkedHashMap
        LinkedHashMap<String,Integer> m =
                new LinkedHashMap<String, Integer>();

        m.put("1 - Bedroom" , 25000);
        m.put("2 - Bedroom" , 50000);
        m.put("3 - Bedroom" , 75000);
        m.put("1 - Bedroom - hall", 65000);
        m.put("2 - Bedroom - hall", 85000);
        m.put("3 - Bedroom - hall", 105000);

        // Using entrySet() to get the entry's of the map
        Set<Map.Entry<String,Integer>> s = m.entrySet();

        for (Map.Entry<String, Integer> it: s)
        {
            // Using the getKey to get key of the it element
            // Using the getValue to get value of the it element
            System.out.println("Before channge of value = " +
                    it.getKey() + "   " +  it.getValue());

            // Changing the value of 1 - Bedroom.
            double getRandom = Math.random() * 100000;
            int getRoundoff = (int) Math.round(getRandom);

            // Using setValue to change the value of the
            // map element
            it.setValue(getRoundoff);

            System.out.println("After change of value = " +
                    it.getKey() + "   " + it.getValue());
        }
    }
}
