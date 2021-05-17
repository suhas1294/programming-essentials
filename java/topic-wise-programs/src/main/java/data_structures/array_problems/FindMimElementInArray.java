package data_structures.array_problems;

public class FindMimElementInArray {
    public static void main(String[] args) {
        //int[] arr = {64, 25, 12, 22,11};
        int[] arr =  {5,4,3,2,1}; // worst case

        int min = arr[0] ;
        int loopCount = 0;
        for (int i = 0; i < arr.length-1; i++) {
            loopCount += 1;
            if (arr[i]  > arr [i+1]){
               min = arr[i+1];
            }else {
                min = arr[i];
            }
        }
        System.out.println("Loop count = " + loopCount);
        System.out.println(min);
        System.out.println("**********\n\n");
        //printArray(selectionSort(arr));
        printArray(bubbleSort(arr));
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static int[] selectionSort(int[] array){
        for(int j = 0; j < array.length-1;j++){
            int index_of_min = j;
            for (int i = index_of_min; i < (array.length-1); i++) {
                index_of_min = (array[index_of_min] > array[i+1]) ? i+1 : index_of_min;
            }
            int temp = array[j];
            array[j] = array[index_of_min];
            array[index_of_min] = temp;
        }
        return array;
    }

    public static int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }
}
