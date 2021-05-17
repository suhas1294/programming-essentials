package _8exceptionHandling;

public class NestTry {

	public static void main(String[] args) {

		try {
				System.out.println("Main Try 1");
				int num1 = 100;
				int num2= 24;
				System.out.println("N1 :" + num1+ "  N2 :" + num2);
			try {
				System.out.println("\nInner Try");
				int i = 10, j = 0;
				int div = i / j;
				System.out.println("DIv" + div);
			} catch (ArithmeticException e) {
				System.out.println("Exeception while dividing : "+ e);
			}

			System.out.println("\nMain Try 2");
			
			int res=num1+num2;
			System.out.println("Res [N1 + N2] :" + res);
		} catch (NumberFormatException e) {
			System.out.println("Num exe->"+ e);
		}

	}

}
