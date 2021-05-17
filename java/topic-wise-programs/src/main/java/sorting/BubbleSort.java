package sorting;

/**
 * performs sorting by repeatedly moving the largest element to the highest index of the array.
 * It comprises of comparing each element to its ADJACENT element and replace them accordingly
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = {11, 24, 12, 6, 19, 21, 13};

        System.out.println("Before sorting:");
        printArray(array2);

        bubbleSort(array2);

        System.out.println("\nAfter sorting");
        printArray(array2);
    }

    protected static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static int[] bubbleSort(int[] array){
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength-1; i++) {
            for (int j = 0; j < arrayLength-i-1; j++) {
                /*System.out.println(String.format("i:%s\tj:%s",i,j));
                System.out.println(String.format("\na[%s]=%s\ta[%s]=%s", j, array[j], j+1, array[j+1]));
                System.out.println(String.format("\na[j]=%s\ta[j+1]=%s",array[j],array[j+1]));*/
                if (array[j] > array[j+1]){
                    System.out.print("\tswapping");
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                // uncomment to see How sorting happens
                /*System.out.println("\n");
                printArray(array);*/
            }
        }
        return array;
    }
}

/**
 * 4,3,1,2
 *
 * check 4 with 3, swap
 * check 4 with 1, swap
 * check 4 with 2, swap
 * check 3 with 1, swap
 * check 3 with 2, swap
 * check 3 with 4, No swap
 * check 1 with 2, No swap
 * check 1 with 3, No Swap
 * check 1 with 4, No Swap
 */