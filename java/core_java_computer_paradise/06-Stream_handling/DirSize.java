

	import java.io.*;
	
	class DirSize
	{
	public static void main(String v[])
	{

	try
	{

	File f = new File( v[0] );

	if( f.exists() && f.isDirectory() )
	{
		
	  String []fnames = f.list();

	  long s=0;

	  for(int i=0;i<fnames.length; i++)
	  {
	  
	  String path = v[0] + "\\" + fnames[i];
	  System.out.print(String.format("%-40s\r", path ));

	  try{ Thread.sleep(5); } catch( InterruptedException e){ }

	  s = s + new RandomAccessFile( path , "r").length();
	 }
		
	  double tsize = s/(1024*1024.0);	
	
	  System.out.println("Directory size = " + tsize + " Mb");

	}
	else
	System.out.println("Directory not found/Not a directory");

	}
	catch( Exception e)
	{
	  System.out.println(e);
	}
	
	}
	}
