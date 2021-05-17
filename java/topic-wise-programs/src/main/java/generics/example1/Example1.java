package generics.example1;

class Student{
	String name;
	int rollNo;
}

// 'T' represents type i.e., Integer, String It supports ONLY Wrapper Class not primitive type
class Container<T>{
	T value;

	public T getValue() {
		System.out.println("type is: " + value.getClass().getName());
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	public void show(){
		System.out.println(value.getClass().getName());
	}
}

public class Example1 {
	public static void main(String args[]){
		Container obj = new Container();
		Container<?> obj1 = new Container(); // '?' represents raw type
		Container<Integer> obj2 = new Container();
		Container<Double> obj3 = new Container();

		try{
			obj.show(); // will throw nullPointerException
		} catch (NullPointerException e){
			System.out.println("NullPointerException thown since 'value' does not have any value");
		}
		obj.value = "johndoe";
		obj.show(); // Now this works

		// obj2.value = "sdf";      !! cannot be done, compile time error

		obj2.value = 56;
		obj2.show();

		obj3.value = 3.14784667;
		obj3.show();

		// After generating getter and setter
		obj.setValue("foobar");
		obj.getValue();

		// obj2.setValue("johndoe");        !! Compilation time error, it accepts only Integer type
		obj2.setValue(76);
		obj2.getValue();

		// obj3.setValue(45);        !! Compilation time error, it accepts only Double type
		obj3.setValue(90.99);
		obj3.getValue();

		Container<Student> obj4 = new Container<>();

		// Integer, Double, long all extends 'Number' class
	}
}
