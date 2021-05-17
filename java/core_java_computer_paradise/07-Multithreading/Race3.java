

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

	public void SetEngineProblem( )
	{
		t.suspend();
	}

	public void EngineProblemRectified( )
	{
		t.resume();
	}
	
	public void Crash()
	{
	  	t.stop();
	}

	
	public void cheatCode()
	{	
		try { t.join(); } catch( InterruptedException e){ }
	}

	}

	class Race3
	{
	  public static void main(String v[])		
	  {
		
	   Car c = new Car( );
	
	   for(int i=1; i<=10 ; i++)
 	   {

	    if( i == 4 ) c.cheatCode();
	  

	    System.out.println("    Computer car finished " + i + " rounds");
	    try		
	    {	
	      Thread.sleep(1000);
	    }
	    catch( InterruptedException e ) {  }
	   }
	  } 
 	 }
	    



