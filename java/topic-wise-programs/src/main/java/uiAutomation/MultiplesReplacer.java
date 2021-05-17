package uiAutomation;//question asked in Nextgen healthcare

public class MultiplesReplacer {
	public static void main(String args[]){
		for (int i=0;i<=100;i++){
			if (i%3 == 0){
				System.out.println("Fizz");
			}
			else if (i%5 == 0){
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
