package _7interface;

import java.util.Scanner;

interface DB {
	void connect();

	void transaction();
}

class Oracle implements DB {

	public void connect() {
		System.out.println("Connecting to oracle database...");
	}

	public void transaction() {
		System.out.println(". New patient (oracle)");
		System.out.println(". Doctor details ( oracle )");
		System.out.println(". Pharmacy details ( oracle )");
	}

}

class SqlServer implements DB {

	public void connect() {
		System.out.println("Connecting to Sqlserver database...");
	}

	public void transaction() {
		System.out.println(". New patient (Sqlserver)");
		System.out.println(". Doctor details ( Sqlserver )");
		System.out.println(". Pharmacy details ( Sqlserver )");
	}

}

class DBmain {

	public static void main(String v[]) {

		DB c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose ur DB product \n1.Oracle \n2.SQL ");

		int ch = scanner.nextInt();

		if (ch == 1)
			c = new Oracle();
		else
			c = new SqlServer();

		c.connect();
		c.transaction();
	}

}
