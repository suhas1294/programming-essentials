package core_concepts.interface_examples;

interface  L1_cls {
	public int add(int a, int b);
	
}

interface L2_cls extends L1_cls {
	public int mul(int a, int b);
}

interface L3_cls extends L2_cls {
	public int sub(int a, int b);
}

class muti implements L3_cls{
	public int add(int a, int b) {
		return a + b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
}

public class MultiLevel {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int sum = 0, diff = 0, mul = 0;
		
		muti L3Obj = new muti();
		
		sum = L3Obj.add(a, b);
		diff = L3Obj.sub(a, b);
		mul = L3Obj.mul(a, b);
		
		System.out.println("sum " + sum);
		System.out.println("Diff " + diff);
		System.out.println("Mul " + mul);
	}
}

