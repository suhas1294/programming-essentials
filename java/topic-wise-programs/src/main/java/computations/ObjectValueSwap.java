package computations;

class A{
	int value;
	public A(int i){
		this.value = i;
	}
}

public class ObjectValueSwap {
	public static void main(String[] args) {
		A a1 = new A(100);
		A a2 = new A(200);
		swap(a1,a2);
		System.out.println(a1.value);
		System.out.println(a2.value);
	}
	public static void swap(A a1, A a2){
		A temp = new A(a1.value);
		a1.value = a2.value;
		a2.value = temp.value;
	}
}