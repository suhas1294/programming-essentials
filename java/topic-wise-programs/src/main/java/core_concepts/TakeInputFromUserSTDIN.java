package core_concepts;

import java.util.Scanner;

public class TakeInputFromUserSTDIN {
	public static void main(String[] args) {
		System.out.println("enter input:\n");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println("your string is " + s);
	}
}
