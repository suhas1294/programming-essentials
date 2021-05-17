package computations;

import FileOps.ReadResourceFileAndUpdate;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
problem statement:
1.Read a file and give the Map result of characters and their occurrences
2.result should be in descending order of values(i.e., occurrences count)
3.When values of two keys are equal, those keys should be sorted reverse alphabetically.
*/

public class Interview {
    public static void main(String[] args) {
        File file = new File(ReadResourceFileAndUpdate.class.getClassLoader().getResource("words.txt").getFile());
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            Map<String, Integer> result = new HashMap<>();

            // step1 : getting the map of letter and their occurences
            while ((line = br.readLine()) != null) {
                String alphaOnly = line.replaceAll("[^a-zA-Z]+","");
                String stringArray[] = alphaOnly.split("");
                for (int i = 0; i < stringArray.length; i++) {
                    String singleLetter = stringArray[i].toLowerCase();
                    if (result.containsKey(singleLetter)) {
                        result.put(singleLetter, result.get(singleLetter) + 1);
                    } else {
                        result.put(singleLetter, 1);
                    }
                }
            }

            // step2: sorting the result map based on their keys in reverse alphabetical order
            // here tree map is used along with Collections-reverseOrder method to get the map reverse alphabetically
            Map<String, Integer> resultReverseAlpha = new TreeMap<>(Collections.reverseOrder());
            resultReverseAlpha.putAll(result);

            // step3: sorting the above result map based on key values descending using stream api and Comparator class
            // here LinkedHashMap is used to preserve the order of elements in which its is inserted
            Map resultDescValue = new LinkedHashMap();
            resultReverseAlpha.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> resultDescValue.put(x.getKey(), x.getValue()));

            // step4: output the result
            System.out.println(resultDescValue);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}