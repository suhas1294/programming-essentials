package core_concepts;

class A1 {
	public void printName() {
		System.out.println("A");
	}
}

class B extends A1 {
	public void printName() {
		System.out.println("B");
	}
}

public class Polytance {

	public void printName(A1 a) {
		System.out.println("AA");
	}

	public void printName(B b) {
		System.out.println("BB");
	}

	public static void main(String[] args) {
		A1 a = new A1();
		a.printName();
		a = new B();
		a.printName();
		Polytance c = new Polytance();
		c.printName(a);
		c.printName(new B());
	}

}

// A
// B
// AA
// BB