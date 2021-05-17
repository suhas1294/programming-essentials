
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

	public boolean equals(Object obj)  
	{
	 if( x == ((Point)obj).x && y == ((Point)obj).y )
		return true;
	 else
		return false;

	}
	}

	class eg5
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

 