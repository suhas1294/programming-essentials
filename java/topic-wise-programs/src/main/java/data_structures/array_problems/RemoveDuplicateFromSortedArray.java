package data_structures.array_problems;

/**
 * removing duplicates from a sorted array
 */
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5};
        int[] result = removeDuplicates(array);
        int result2 = removeDuplicates(array, array.length);

        /*for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"\t");
        }*/
    }

    private static int[] removeDuplicates(int[] array){
        int[] tempArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i+1]){
                tempArray[j] = array[i];
                j++;
            }
        }
        //System.out.println("value of j after loop: " + j);
        tempArray[j] = array[array.length-1];

        for (int i = 0; i < j; i++) {
            System.out.print(tempArray[i]+"\t");
        }
        return array;
    }

    private static int removeDuplicates(int arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;

        // To store index of next unique element
        int j = 0;

        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];

        arr[j++] = arr[n-1];

        return j;
    }
}