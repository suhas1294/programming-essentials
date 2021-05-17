
	import java.io.*;

	class RAF2
	{
	public static void main(String v[])
	{

	try
	{
	RandomAccessFile rnd = new RandomAccessFile("data.dat", "r");
		
	int max = (int)rnd.length()/4;

	for(int i=1; i<=max; i++)
	{
	  int val = rnd.readInt();
	  System.out.println(val);
	}
	
	rnd.close();

	}
	catch( Exception e)
	{	 
	  System.out.println(e);
	}

	}
	}

	