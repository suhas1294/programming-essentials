

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

	class eg8
	{
	public static void main(String v[])
	{
		Point p = new Point();
		p.set( 10 , 20 );
	
		Point q = p;
		q.set( 1000 , 2000 );


		System.out.println(p);
	}
	}

	Objects are by reference type

	


