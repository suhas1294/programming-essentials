package core_concepts;
	//private class{
	// top level class cannot be private
	//		}
public class Inheritance1 {
	private class PriClass{
		int priInt = 10;
	}
	protected class ProClass{
		int proInt = 20;
	}
	public static void main(String args[]){
		System.out.println("Inside main class");
		Inheritance1 inheritance1 = new Inheritance1();
		
		// below code will give error
		
		// PriClass priClass = new PriClass();
		// ProClass proClass = new ProClass();
		// System.out.println(priClass.priInt);
		// System.out.println(proClass.proInt);
		
		// below code will work fine
		// explaination: inner class which requires an instance of the encoding class (JavaApp1) in order to construct it.
		// https://stackoverflow.com/questions/10301907/why-do-i-get-non-static-variable-this-cannot-be-referenced-from-a-static-contex
		
		PriClass priClass1 = new Inheritance1().new PriClass();
	}
}
