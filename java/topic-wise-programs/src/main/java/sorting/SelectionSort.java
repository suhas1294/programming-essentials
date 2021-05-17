package sorting;

import static sorting.BubbleSort.printArray;

/**
 * repeatedly finding the minimum element (considering ascending order) from unsorted part and
 * putting it at the beginning.
 * The algorithm maintains two subarrays in a given array : sorted array, remaining unsorted array
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = {11, 24, 12, 6, 19, 21, 13};

        System.out.println("Before sorting:");
        printArray(array2);

        selectionSort(array2);

        System.out.println("\nAfter sorting");
        printArray(array2);
    }
    private static void selectionSort(int arr[])
    {
        int arrayLength = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < arrayLength-1; i++)
        {
            // Find the minimum element in unsorted array
            int indexOfMin = i;
            System.out.println("Index of minimum element: " + indexOfMin);
            for (int j = i+1; j < arrayLength; j++){
                if (arr[j] < arr[indexOfMin]){
                    indexOfMin = j;
                }
            }
            // Swap the found minimum element with the first
            // element
            int temp = arr[indexOfMin];
            arr[indexOfMin] = arr[i];
            arr[i] = temp;
        }
    }
}
