package computations;

public class StringSplitChar {
	public static void main(String args[]){
		String a = "example";
		String arr[] = a.split("");
		for (String s: arr){
			System.out.print(s.toUpperCase());
		}
	}
}
