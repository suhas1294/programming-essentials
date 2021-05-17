package core_concepts;

public class ConstructorOverloading {
	public ConstructorOverloading(){
		System.out.println("THis is default constructor without args");
	}
	public ConstructorOverloading(String s){
		System.out.println("Value is : "+ s);
	}
	public ConstructorOverloading(String s, String m){
		System.out.println("Overloaded Value is : "+ s);
	}
	public static void main(String args[]){
		ConstructorOverloading constructorOverloading = new ConstructorOverloading("johndoe", "foobar");
	}
}
