
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


	class eg6
	{
	public static void main(String v[])
	{

	Point p = new Point();
	Point q = new Point();
	Point r = new Point();

	System.out.println( p.hashCode()  );
	System.out.println( q.hashCode()  );
	System.out.println( r.hashCode()  );

	}

	}
	