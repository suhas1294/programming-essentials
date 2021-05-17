package core_concepts;

class Student{
	private int id;
	private String marks;
	private String name;

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", marks='" + marks + '\'' +
				", name='" + name + '\'' +
				'}';
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String marks, String name){
		this.id = id;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public int hashCode(){
		System.out.println("Marks hashcode: " + marks.hashCode());
		int result = marks.hashCode();
		result = 31 * result + name.hashCode();
		System.out.println("Name hashcode: " + name.hashCode());
		System.out.println(result);
		return result;
	}
}
public class HashCodeOverride {
	public static void main(String[] args) {
		Student student = new Student(1, "75", "johndoe");
		System.out.println(student);
		System.out.println("#### code ####");
		System.out.println(student.hashCode());
	}
}
