
import java.io.*;
import java.util.*;

class readFileContent
{
public static void main(String v[])throws IOException, InterruptedException
{
	FileInputStream fp = null;
	String filename=null,sdata="";
	if( v.length == 0 )
	{
	 Scanner key = new Scanner( System.in );
	 System.out.println("Enter filename");
	 filename = key.nextLine();
	}
	else
	filename = v[0];

	try
	{
	 fp = new FileInputStream( filename );
	 int data;
	 while( ( data = fp.read() ) != -1)
	 {
	 while(data!="\n")//replace \n by its ascii value
		{sdata+=data;}
	   System.out.println(sdata);
	   Thread.sleep(50);
	 }
	}
	catch( FileNotFoundException e )	
	{
	 System.out.println("Source file not found...");
	}
	finally
	{
	 if( fp != null)
	  fp.close();	
 	}

	}
	}
		
