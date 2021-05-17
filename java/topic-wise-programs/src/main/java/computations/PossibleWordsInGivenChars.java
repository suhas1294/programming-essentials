package computations;

import java.util.Arrays;

public class PossibleWordsInGivenChars {
    public static void main(String[] args) {
        String[] dict = {"go","bat","me","eat","goal","boy", "run"};
        String[] arr = {"e", "o", "b", "a", "m", "g", "l"};
        for (String str: dict) {
            if (Arrays.asList(arr).containsAll(Arrays.asList(str.split("")))){
                System.out.print(str+" ");
            }
        }
        System.out.println("\n");
        int[] input = {1, 1, 2, 3, 4, 6, 8, 11};
        int targetValue = 11;
        twoSum(input, targetValue);

    }

    public static boolean twoSum(int[] input, int targetValue) {
        int pointerOne = 0;
        int pointerTwo = input.length - 1;

        while (pointerOne < pointerTwo) {
            System.out.println("combinations: " + input[pointerOne] + ":\t" + input[pointerTwo]);

            int sum = input[pointerOne] + input[pointerTwo];

            if (sum == targetValue) {
                return true;
            } else if (sum < targetValue) {
                pointerOne++;
            } else {
                pointerTwo--;
            }
        }

        return false;
    }
}
