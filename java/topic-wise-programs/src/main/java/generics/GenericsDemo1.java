package generics;

class Student1<T>{
	T name;

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
		System.out.println("Name is set to : " + name);
	}
}

class Container<T>
{
	T value;
	Student1 student;

	public Student1 getStudent() {
		return student;
	}

	public void setStudent(Student1 student) {
		this.student = student;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}

public class GenericsDemo1 {
	public static void main(String args[]){
		generics.example1.Container<Integer> i = new generics.example1.Container<Integer>();

		Student1 s = new Student1();
		s.setName("johndoe");
		i.setStudent(s);

		i.setValue(5);
		i.getStudent().setName("foobar");
	}
}
