package data_structures.array_problems;

public class ArrayRotation1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int rotateBy = 6;
        int[] result = rotateByN(rotateBy, arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    private static int[] rotateByN(int by, int[] arr){
        int arrSize = arr.length;
        int[] temp = new int[by];
        int[] result = new int[arrSize];

        for (int i = 0; i < by; i++) {
            temp[i] = arr[i];
        }
        for (int i = by; i < (arr.length); i++) {
            result[i-by] = arr[i];
        }
        for (int i = 0; i < (temp.length); i++) {
            int k = (arrSize-by) + i;
            result[k] = temp[i];
        }
        return result;
    }
}