

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

	class eg3
	{
	public static void main(String v[])
	{
		Point p = new Point();
		p.set( 10 , 20);	
		System.out.println(p);
	}
	}


	





	