package core_concepts;

package basics;

class ParentClass{
	static String s = "johndoe";
	String non_static_string = "example";
	void printSomething(){
		System.out.println("printing from parent class");
	}
	static void overrideStaticFn(){
		System.out.println("This is also from parent class");
	}
}
public class Inheritance2 extends ParentClass{
	@Override
	void printSomething() {
		System.out.println("This is overrided from child class");
	}

	// you can not override static method in Java,
	//	void overrideStaticFn(){
	//
	//	}

	public static void main(String args[]){

		// below code will work
		s = "new value";
		System.out.println(s);
		Inheritance2 inheritance2 = new Inheritance2();
		inheritance2.printSomething();

		// non static field cannot be referenced from a static context
		// System.out.println(non_static_string);
	}
}
