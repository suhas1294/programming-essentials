import java.util.*;
class HashTableDemo
{
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

/*	Q.  Create hashtable

		key		value
		-------------------------
		regno	    student-object

	Programmer should create a class
	called student with typical members
	like regno , name , branch...etc

	Program should be provided with
	option for

	1. Add new student
	2. Search on regno
	3. Exit


	Refer the site for more examples
	  [ http://www.java2s.com ]

*/







