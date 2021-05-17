package core_concepts;

class Parent{
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	int age;
}
public class GetterSetter {
	public static void main(String args[]){
		Parent parent = new Parent();
		parent.age = 25;
		System.out.println("------ : " + parent.age);
	}
}