

	class Point
	{
	private int x, y;
	
	void set( int X , int Y )
	{
	  x = X;
	  y = Y;
	}
	
	public String toString()
	{
	return x + "," + y;
	}

	}

	class RefType
	{

	public static void ReadObject( Point arg)
	{
	 arg.set( 10 , 20 );
	}

	public static void main(String v[])
	{
 	  Point p = new Point();
	  ReadObject( p );
	  System.out.println( p );
	}	

	}