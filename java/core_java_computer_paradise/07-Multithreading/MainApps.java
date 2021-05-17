	
	import java.io.*;
	
	class FileDownloader implements Runnable
	{

	Thread t;
	String filename;
	boolean flag;
	public FileDownloader( String file , int plevel )
	{
	  filename = file;
	  flag = true;
	  t = new Thread(this);
	  t.setPriority( plevel );
	  t.start();
	}
	
	public void run( )
	{
	 
	try
	{
	  FileOutputStream fp = new FileOutputStream( filename );

	  while( flag )
	  {
	   fp.write( '$' ); // assume $ is data downloaded from network
	   Thread.sleep(1);  // 0.01 secs	
	   }

	  fp.close();
	 }
	 catch( Exception e){ }
	}

	void stopDownload()
	{
		flag = false;
	}

	}

	class MainApps
	{
	public static void main(String v[])
	{

	FileDownloader f1 = new FileDownloader("low.html", 2 );

	FileDownloader f2 = new FileDownloader("high.html", 8 );

	try	
	{
	  Thread.sleep(5000);  // 5 secs
	}
	catch( InterruptedException e){ }

	f2.stopDownload();
	f1.stopDownload();

	}

	}

	
			

	
	  







