
	class Point
	{
	private int x , y;

	public void set(int X , int Y )
	{
	 x  = X;
	 y = Y;
	}

	public String toString()
	{
	 return x + "," + y;
	}

	}

	class eg4
	{
	public static void main(String v[])
	{
	Point p = new Point();
	Point q = new Point();


	p.set( 10 , 20 );
	q.set( 10 , 20 );

	if( p.equals(q) )
	System.out.println("Located at same position");
	else
	System.out.println("Locate at different position");

	}
	}


	Above comparsion internally invokes the
	function of Object class , which compares
	based on Instance-id ( address ) not
	object state.

	If we override equals function , then
	we can change the meaning to compare
	based on object state( values ).


	 


