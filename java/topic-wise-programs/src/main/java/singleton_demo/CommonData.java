package singleton_demo;

public class CommonData {
	private static CommonData ourInstance = new CommonData();

	public static CommonData getInstance() {
		return ourInstance;
	}

	private CommonData() {
	}
}
