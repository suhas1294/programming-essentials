

	import BM.*;

	class pkg1
	{
	public static void main(String v[])
	{

	easyCalc o = new easyCalc();

	int a = Integer.parseInt(v[0]);
	int b = Integer.parseInt(v[1]);

	int c = o.add( a , b );

	System.out.println("Result = "+c);
	}
	}

