
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


	class eg7
	{
	public static void main(String v[])
	{
	 Point p = new Point();
	 p.set( 10,  20 );

	 Point q = p;

	 System.out.println( q.hashCode() );
	 System.out.println( p.hashCode() );

	 if( p.equals( q ) )
	   System.out.println( "same");
	else
	   System.out.println("different");

	}
	}
	




