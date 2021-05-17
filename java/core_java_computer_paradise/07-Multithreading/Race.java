

	class Car implements Runnable
	{
	
	Thread t;
	
	public Car()
	{
	 t = new Thread(this);
	 t.start();
	}

	public void run()
	{

	for(int i=1; i<=10 ; i++)
	{
	 System.out.println("Users car finished " + i + " rounds");
	 try		
	 {	
	    Thread.sleep(1000);
	 }
	 catch( InterruptedException e ) {  }

	}

	}

	}

	class Race
	{
	  public static void main(String v[])		
	  {
		
	   Car c = new Car( );
	
	   for(int i=1; i<=10 ; i++)
 	   {
	    System.out.println("    Computer car finished " + i + " rounds");
	    try		
	    {	
	      Thread.sleep(1000);
	    }
	    catch( InterruptedException e ) {  }
	   }
	  } 
 	 }
	    



