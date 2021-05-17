package _8exceptionHandling;

import java.util.Scanner;

//@SuppressWarnings("serial")
class UserError extends Exception {
	String msg;

	public UserError(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return msg;
	}
}

class Company {
	private int h, m;

//	public void Login(int H, int M) throws UserError {  //throws
		
	public void Login(int H, int M) throws UserError {
		if (H < 0 || H > 24 || M < 0 || M > 60)
			throw new UserError("Invalid time stamp");  //throw
		else {

		h = H;
		m = M;
		}
		
		System.out.println("Your login successfull\n");
	}

	public void LoggedInTime() {
		System.out.println("Login time --> " + h + ":" + m);
	}
}

class CustExcep_Time_throws_throw {
	
	public static void main(String v[]) {
		try {
			Scanner key = new Scanner(System.in);
			System.out.println("Enter Ur LogIn Details\n");

			System.out.println("Enter Hour");
			int h = key.nextInt();
			System.out.println("Enter Minutes");
			int m = key.nextInt();

			Company c = new Company();
			c.Login(h, m);
			c.LoggedInTime();
		} catch (UserError e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please send login time from command line");
		} catch (NumberFormatException e) {
			System.out.println("Time can be only numbers");
		}

	}
}
