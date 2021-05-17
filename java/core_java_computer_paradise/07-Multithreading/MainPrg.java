

	class CClk implements Runnable
	{
	Thread t;
	String country;
	int h , m , s;	
	
	CClk( String c , int h, int m , int s )
	{
		this.h = h;
		this.m = m;
		this.s = s;
		country = c;
		t = new Thread(this);
		t.start();
	}

	public void run( )
	{
	  while(true )
	  {
		s++;
		if( s == 60 ){ s=0; m++; }	
		if( m == 60 ) { s =m=0; h++;}	
		if( h == 24 ) {h = m = s = 0;}

	  System.out.println(country + "===>" + h + ":" + m + ":" + s );

	  try 
	  {
		Thread.sleep(1000);
	  }
	  catch( InterruptedException e) {  }
	}

	}
	}	  


	class MainPrg
	{
	public static void main(String v[])
	{

	 CClk c1 = new CClk("India", 7 , 57 , 23 );
	 CClk c2 = new CClk("China", 10 , 12 , 56 );
	 CClk c3 = new CClk("Japan", 4 , 19 , 10 );

	}

	}
	
 