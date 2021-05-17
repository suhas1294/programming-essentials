
	
	import java.io.*;
	import java.util.*;

	class FileCopy
	{

	public static void main(String v[])
	{

	FileInputStream fin = null;
	FileOutputStream fout = null;

	String source=null , target=null;

	try
	{
	  source = v[0];
	  target = v[1];
	}
	catch( ArrayIndexOutOfBoundsException e )
	{
	  System.out.println("Usage: java Filecopy <source> <target>");	
	  return;
	}

	try
	{	
	  fin = new FileInputStream( source );

	  if( source.equalsIgnoreCase(target))
	  {
		System.out.println("Can't copy to itself");
		return;
	  }

	}
	catch( FileNotFoundException e )
	{
	  System.out.println("Source file not found...");
	  return;
	}
	
	try
	{
	 
	    File f = new File( target );
	    if( f.exists() )	
	    {
	      System.out.println("Target file already exists [O]verwrite [A]ppend [Q]uit");
	      Scanner key = new Scanner( System.in);
	      String reply = key.nextLine();

	      if( reply.equalsIgnoreCase("Q"))
		return;

	      else if( reply.equalsIgnoreCase("A"))
		fout = new FileOutputStream( target , true );

	      else if( reply.equalsIgnoreCase("O"))
		fout = new FileOutputStream( target );
	     
	     else	
	     {
		System.out.println("Sorry - invalid choice , application terminated.");
		return;
	     }	
	    }
	    else
	    fout = new FileOutputStream( target );
		    
		int data , c=0;
		while(  ( data = fin.read() )!=-1)
		{
		fout.write( (char)data );
		c++;
		}

		System.out.println("Successfully copied , " + c + " bytes");

	    }
	    catch( Exception e )
	    {
	     System.out.println("Error while copying...");
	    }
	    finally
	    {
		try
		{
		  if( fin != null ) fin.close();
		  if( fout != null ) fout.close();
		}
		catch( IOException e) {  }
	    }

	}
	}

				










	 
		





		












	