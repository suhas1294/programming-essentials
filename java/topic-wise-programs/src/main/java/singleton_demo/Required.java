package singleton_demo;

public class Required {
	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Required(long id, String name) {
		this.id = id;
		this.name = name;
	}
}
