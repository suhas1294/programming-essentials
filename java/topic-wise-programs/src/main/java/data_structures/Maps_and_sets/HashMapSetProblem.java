/*
Given an array and a sum value as the inputs. Output any pair of numbers that sum up to the given number. Constraints: Array may have duplicate elements and it is unordered.
Example: A = [3,6,7,1,9,4], Sum = 8
(Question asked to gauge the understanding of the candidate about the usage of HashMap, HashSets)
*/

package data_structures.Maps_and_sets;

import java.util.*;

public class HashMapSetProblem {
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array:\n");
		int arr_size = scanner.nextInt();
		int arr[] = new int[arr_size];
		System.out.println(String.format("Enter %d number of elements one by one", arr_size));
		for (int i = 0; i < arr_size; i++) {
			arr[i] = Integer.parseInt(scanner.nextLine());
		}
		System.out.println("Enter the sum value");
		int sum = Integer.parseInt(scanner.nextLine());*/
		int arr[] = {1,2,3,4,5,6,7,8};
		int sum = 8;

		// Instant start = Instant.now();
		Map result = solve(arr,sum);
		// Instant finish = Instant.now();

		System.out.println(result);

		/*long timeElapsed = Duration.between(start, finish).toNanos();
		System.out.println("Time taken  = " + timeElapsed);*/
	}
	protected static Map solve(int arr[], int sum){
		Map result = new HashMap();
		for (int i = 0; i <  arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == sum){
					result.put(arr[i] ,arr[j] );
				}
			}
		}
		List<Integer> resultValues = new ArrayList(result.values());
		for (Object i : resultValues){
			if ((result.get(i) != null) && !(i == result.get(i))){
				result.remove(result.get(i));
			}
		}
		return result;
	}
}
