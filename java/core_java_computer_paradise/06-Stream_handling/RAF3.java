

	import java.io.*;

	class RAF3
	{
	public static void main(String v[])
	{

	try
	{
	RandomAccessFile rnd = new RandomAccessFile("data.dat", "rw");

	rnd.seek( rnd.length() );

	for(int i=0; i<v.length; i++)
	rnd.writeInt( Integer.parseInt( v[i] ) );
	
	rnd.close();

	}
	catch( Exception e)
	{	 
	  System.out.println(e);
	}

	}
	}

	