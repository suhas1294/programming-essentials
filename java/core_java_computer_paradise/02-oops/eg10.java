
	class MobileServer
	{

	private int cval;

	public MobileServer()
	{
	cval = 10;
	}

	public MobileServer( int v )
	{
	 cval = v;
	}
	

	public String toString()
	{
	  return cval + " Rs Balance";
	}

	}

	class eg10
	{
	public static void main(String v[])
	{

	MobileServer s1 = new MobileServer();
	MobileServer s2 = new MobileServer(50);

	System.out.println(s1);
	System.out.println(s2);
	}
	
	}

