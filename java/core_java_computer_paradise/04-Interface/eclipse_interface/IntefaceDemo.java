package _7interface;

import java.util.Scanner;

interface MathOperation {
	public int add(int a, int b);
	public void result();
}

class ClassImpInterface1 implements MathOperation {
	int c;

	public int add(int a, int b) {
		c = a + b;
		return c;
	}

	public void result() {
		System.out.println("Result is->" + c);
	}
}

class ClassImpInterface2 implements MathOperation {
	int c;

	public int add(int a, int b) {
		c = a -b;
		return c;
	}

	public void result() {
		System.out.println("Difference is->" + c);
	}
}

public class IntefaceDemo {

	public static void main(String[] args) {

		int num1 = 0, num2 = 0;
		MathOperation objInterface = null;

		Scanner key = new Scanner(System.in);
		System.out.println("Enter numbers to be Add\n");

		System.out.println("Num1->");
		num1 = key.nextInt();

		System.out.println("\nNum2->");
		num2 = key.nextInt();
		while(true){
		System.out.println("Choice of msg to be displayed\n");
		System.out.println("1.Result \n2.Sum \n3.Exit");
		System.out.println("Enter choice");
		
		int choice = key.nextInt();
		if (choice == 1) {
			objInterface = new ClassImpInterface1();
			objInterface.add(num1, num2);
			objInterface.result();
			
		} else if (choice == 2) {
			objInterface = new ClassImpInterface2();
			objInterface.add(num1, num2);
			objInterface.result();
			
		}
		else
			break;
		
		}

	}

}
