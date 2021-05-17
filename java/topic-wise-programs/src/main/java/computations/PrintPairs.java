/*
Given an array and a sum value as the inputs. Output any pair of numbers that sum up to the given number. Constraints: Array may have duplicate elements and it is unordered.
Example: A = [3,6,7,1,9,4], Sum = 8
(Question asked to gauge the understanding of the candidate about the usage of HashMap, HashSets)
*/

package computations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class PrintPairs
{
	static Map printpairs(int arr[], int sum)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		Map result = new HashMap();

		for (int i=0; i<arr.length; ++i)
		{
			int temp = sum-arr[i];
			// checking for condition
			if (s.contains(temp))
			{
				result.put(arr[i], temp);
				// System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", "+temp+")");
			}
			s.add(arr[i]);
		}

		return result;
	}

	// Main to test the above function
	public static void main (String[] args)
	{
		int A[] = {1,2,3,4,5,6,7,8};
		int n = 8;

		// Instant start = Instant.now();
		Map result = printpairs(A,  n);
		// Instant finish = Instant.now();
		System.out.println(result);
		/*long timeElapsed = Duration.between(start, finish).toNanos();
		System.out.println("Time taken  = " + timeElapsed);*/
	}
}