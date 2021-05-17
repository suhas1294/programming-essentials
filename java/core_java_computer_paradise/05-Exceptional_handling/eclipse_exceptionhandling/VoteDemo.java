package _8exceptionHandling;

import java.util.*;

class VoteDemo {
	public static void main(String v[]) {

		try {
			Scanner key = new Scanner(System.in);

			System.out.println("Enter Year of Birth");

			int yob = key.nextInt();

			Calendar c = Calendar.getInstance();
			int age = c.get(Calendar.YEAR) - yob;

			System.out.println("Your age = " + age);

			if (age >= 18)
				System.out.println("You can vote");
			else
				System.out.println("You can't vote");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage:java vts <year-of-birth>");
		} catch (NumberFormatException e) {
			System.out.println("Year of birth can be only numbers");
		}

	}
}