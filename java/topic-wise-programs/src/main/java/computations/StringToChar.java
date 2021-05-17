package computations;

import java.util.Scanner;

public class StringToChar {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input sequence\n");
		String input = scanner.nextLine();
		System.out.println("Enter Character to be replaced with its number of occurences\n");
		String character = scanner.nextLine();
		char[] arr = input.toCharArray();
		char[] result  = new char[input.length()];
		int scount = 1;
		for (int i=0;i<arr.length;i++){
			String char_to_bre_replaced = String.valueOf(Character.valueOf(arr[i]));
			if (char_to_bre_replaced.equalsIgnoreCase(character)){
				result[i] = Character.forDigit(scount, 10);
				scount = scount + 1;
			}else {
				result[i] = arr[i];
			}
		}
		String final_result = String.valueOf(result);
		System.out.println(final_result);
	}
}
