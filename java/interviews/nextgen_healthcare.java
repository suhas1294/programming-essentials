//following set of questions were asked in nextgen healtcare ihacker round
package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DcExamples {
	
	public static void main(String args[]){
		List l1 = new ArrayList();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add(1, "d");
		System.out.println(l1);  // what will be the output
		
		Map m1 = new HashMap();
		m1.put(1, null);
		m1.put(2, null);
		m1.put(3, null);
		m1.put(4, null);
		System.out.println(m1); // what will be the output
		
		Map m2 = new HashMap();
		m1.put("1", null);
		m1.put("2", null);
		m1.put("3", null);
		m1.put("4", null);
		System.out.println(m2); // what will be the output
		
		String a = "example";
		String b = "example";
		String c = new String("example");
		String d = new String("example");
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(b == a);
		System.out.println(b == d);
		// what will be the output, answer: true false true false
		
		String reveresed_string = reverse("example");
		System.out.println(reveresed_string);
		
	}
	private static String reverse(String input){
		String result = "";
		char[] input_arr = input.toCharArray();
		for (int i=input_arr.length-1; i >= 0; --i){
			result += Character.valueOf(input_arr[i]).toString();
		}
		return result;
	}
}

