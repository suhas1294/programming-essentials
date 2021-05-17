package core_concepts;

public class ScopeTest2 {
	public static void main(String args[]){
		ScopeTest1 scopeTest1 = new ScopeTest1();
		scopeTest1.setX(101);
		System.out.println("value of x is " + scopeTest1.getX());
		System.out.println("initial value is = "+scopeTest1.initial_value);
	}
}
