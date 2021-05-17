package data_structures.array_problems;

public class ArrayRotation2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int rotateBy = 3;
        int[] result = rotateByN(rotateBy, arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] rotateByN(int by, int[] arr){
        for (int i = 0; i < by; i++) {
            arr = rotateByOne(arr);
        }
        return arr;
    }

    private static int[] rotateByOne(int[] arr){
        int[] tempArr = new int[arr.length];
        int firstElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            tempArr[i-1] = arr[i];
        }
        tempArr[arr.length-1] = firstElement;
        return tempArr;
    }
}