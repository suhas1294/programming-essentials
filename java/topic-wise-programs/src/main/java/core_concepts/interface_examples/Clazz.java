package core_concepts.interface_examples;

class Super {
	void foo() {
		System.out.println("Super");
	}
}

class Sub extends Super {
	void foo() {
		super.foo();
		System.out.println("Sub");
	}
}

public class Clazz {
	public static void main(String[] args) {
		new Sub().foo();
	}
}
