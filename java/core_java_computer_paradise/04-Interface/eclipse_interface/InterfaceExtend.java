package _7interface;

interface I1 {
	void disp();
}

interface I2 extends I1 {
	void print();
}

class Simple implements I2 {

	public void disp() {
		System.out.println("display()");
	}

	public void print() {
		System.out.println("Print()");
	}
}

public class InterfaceExtend {
	public static void main(String[] args) {
		Simple obj = new Simple();
		obj.disp();
		obj.print();
	}
}
