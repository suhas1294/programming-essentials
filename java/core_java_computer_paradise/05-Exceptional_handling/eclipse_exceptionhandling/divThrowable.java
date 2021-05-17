package _8exceptionHandling;

import java.util.Scanner;

class divThrowable {
	
	public static void main(String v[]) {

		Throwable throwable=null;
		try {
			Scanner key = new Scanner(System.in);
			System.out.println("Enter Num1");
			int a = key.nextInt();
			System.out.println("Enter Num2");
			int b = key.nextInt();

			double c = a / b;

			System.out.println("Result = " + c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: java divData <no-1> <no-2>");
		} catch (NumberFormatException e) {
			System.out.println("Only numbers are allowed / out of range");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero...");
		}
		System.out.println("Further part of the code...");
	}
}
