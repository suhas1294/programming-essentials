
	import java.io.*;


	class PrintServer
	{
	synchronized void print( String file)
	{

	System.out.println("Printing started for file =" + file);
	try
	{
	FileInputStream fp = new FileInputStream( file );

	int data;
	do
	{
	data = fp.read();
	System.out.print((char)data);
	try { Thread.sleep(5); } catch( InterruptedException xe) {  }
	}
	while( data != -1 );

	fp.close();
	
	System.out.println("\n\nCompleted\n\n");
	}
	catch( Exception e){  }
	
	}
	
	}
	

	class Clients implements Runnable
	{
	  	PrintServer Gk;
		String file;
		Thread t;
		Clients( String file , PrintServer Gk)
		{
			this.file = file;
			this.Gk = Gk;
			t = new Thread(this);
			t.start();
		}
	

		public void run()	
		{
		  Gk.print(file);
		}
	}


	class PrintApps
	{
	public static void main(String v[])
	{

	PrintServer Gk = new PrintServer();
	for(int i=0; i<v.length; i++)
	{
		new Clients( v[i] , Gk );
	}

	}

	}
	
		
	
	