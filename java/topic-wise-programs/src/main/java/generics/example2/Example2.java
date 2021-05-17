package generics.example2;

// Integer, Double, Float all extends 'Number' class

import java.util.ArrayList;

class Container2<T extends Number>{
	T value;
	
	public T getValue() {
		System.out.println("type is: " + value.getClass().getName());
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	public void demo(ArrayList<Integer> obj){
	
	}
	
	public void demo2(ArrayList<? extends Number> obj){
		//-- some logic --
	}
	
	// (?) is a sub class of 'T'
	public void demo3(ArrayList<? extends T> obj){
		// -- some logic --
	}
	
	// super will support all supper classes of T
	// read it as '(?)Number is a super class of Integer(T)
	public void demo4(ArrayList<? super T> obj){
		// -- some logic --
	}
}

public class Example2 {
	public static void main(String args[]){
		Container2<Integer> obj = new Container2();
		Container2<Float> obj2 = new Container2();
		Container2<Double> obj3 = new Container2();
		
		obj.setValue(45);
		obj.getValue();
		
		obj2.setValue(45.88f);
		obj2.getValue();
		
		obj3.setValue(3.14);
		obj.getValue();
		
		obj.demo(new ArrayList<Integer>()); // works fine
		
		// obj.demo(new ArrayList<Number>()); // Does not work
		/*If this has to work, then demo function should be like this:
		public void demo(ArrayList<? extends Number>){
			-- some logic --
		}*/
		// or
		/*If this has to work, then demo function should be like this:
		public void demo(ArrayList<? extends T>){
			-- some logic --
		}*/
		
		Container2<Number> obj5 = new Container2<>();
		obj5.demo2(new ArrayList<Integer>());
		
		Container2<Float> obj6 = new Container2<>();
		obj6.demo3(new ArrayList<Float>());
		
		Container2<Integer> obj7 = new Container2<>();
		obj7.demo4(new ArrayList<Number>());
		
		// Below code does not work
		// Container2<Student> obj4 = new Container2<>();
		
	}
}
