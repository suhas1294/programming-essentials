package data_structures.array_problems;

import java.util.Scanner;

public class ArrayRotation3 {
	public static void main(String[] args) {

		// taking  size of arrayfrom user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr_size = scanner.nextInt();
		System.out.println("Enter the rotation length");
		int k = scanner.nextInt();

		// initializing the array
		int[] a = new int[arr_size];

		// taking array elements from user
		System.out.println("Enter the elements of array");
		for (int i = 0; i < arr_size; i++) {
			a[i] = scanner.nextInt();
		}

		// calling rotate function
		int ra[] = rotate(a, a.length, k);

		// printint the result
		for (int i=0; i< ra.length; i++){
			System.out.print(ra[i] + " ");
		}
	}
	private static int[] rotate(int[] arr, int n, int k){
		int[] result = new int[n];
		for (int i= k; i < n; i++ ){
			int j = i-k;
			result[j] = arr[i];
		}
		int x = 0;
		for (int i = (n-k); i< n;i++){
			result[i] = arr[x];
			x = x+1;
		}
		return result;
	}
}
