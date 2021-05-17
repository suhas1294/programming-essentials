package core_concepts;

class Cat{
	private String breed;
	private String color;
	public Cat(String breed, String color){
		this.breed = breed;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Cat{" +
				"breed='" + breed + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
public class ConstructorReturnType {
	private static Cat init(){
		return new Cat("Asian", "brown");
	}
	public static void main(String[] args) {
		Cat cat = init();
		System.out.println(cat);
	}
}
