
	
	package Company;
	
	public class Employ
	{
	
	private int empno;
	private String name;
	private double basicpay;

	public Employ( int e , String n , double bp )
	{
	  empno = e;
	  name = n;
	  basicpay = bp;	
	}
	
	public int getEmpno() { return empno; }
	public String getName() { return name;}
	public double getBasic() { return basicpay; }
	
	}