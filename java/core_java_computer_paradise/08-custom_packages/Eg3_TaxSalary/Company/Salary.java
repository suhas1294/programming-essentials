
	package Company;

	public class Salary
	{

	public void findSalary(Employ e)
	{
	
	double bp = e.getBasic();
	double hra = 0.20 * bp;
	double esi = 0.06 * bp;
	double pf = 0.25 * bp;
	double da = 0.35 * bp;

	double gross = bp + hra + da;
	double deduction = esi + pf;
	double net = gross - deduction;

	System.out.println("Salary details");
	System.out.println("Empno    :" + e.getEmpno());
	System.out.println("Name     :" + e.getName());
	System.out.println("Basic    :" + bp);
	System.out.println("H.R.A    :" + hra);
	System.out.println("E.S.I    :" + esi);
	System.out.println("P.F      :" + pf);
	System.out.println("D.A      :" + da);
	System.out.println("Gross    :" + gross);
	System.out.println("Deduction:" + deduction);
	System.out.println("Net pay  :" + net );
	}

	}




	