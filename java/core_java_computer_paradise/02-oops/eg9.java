

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
 
	protected Object clone()
	{
	 Point t = new Point();
	 t.set( x , y );
	 return t;
	}

	}


	class eg9
	{
	public static void main(String v[])
	{
	
	Point p = new Point();
	p.set( 10 , 20 );

	Point q = (Point)p.clone();
	System.out.println( q );

	q.set( 90 , 45 );

	System.out.println( p );
	System.out.println( q );

	}

	}
	
	