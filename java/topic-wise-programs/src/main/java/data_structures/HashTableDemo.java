package data_structures;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableDemo {
	public static void main(String v[])
	{
		Hashtable h = new Hashtable();
		h.put("Mysore", "0821");
		h.put("Bangalore", "080");
		h.put("Mandya", "08232");
		h.put("Mangalore", "08932");
		Scanner key = new Scanner( System.in );
		System.out.println("Enter cityname");
		String cname = key.nextLine();
		cname = cname.substring(0,1).toUpperCase() + cname.substring(1).toLowerCase();
		if( h.containsKey(cname))
			System.out.println( h.get(cname));
		else
			System.out.println("Cityname not found..");
	}
}
