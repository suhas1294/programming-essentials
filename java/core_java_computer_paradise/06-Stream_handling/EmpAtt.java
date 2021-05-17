

	import java.io.*;
	import java.util.*;

	class EmpAtt
	{
	public static void main(String v[]) throws IOException
	{
	
	Date d = new Date();
	String filename = String.format("%d-%d-%d.txt", d.getDate(), d.getMonth()+1 , d.getYear()+1900);

	PrintWriter p = new PrintWriter( new FileWriter( filename , true ));	

	p.println( v[0] + "," + d.toString() );
	
	p.close();

	}

	}
