

	class Bank
	{
	 private int balance;
	 private static int cnt , tcash;

	 public Bank()
	 {
	  cnt++;
	 }

	 public void Deposit( int amt )
	 {
	  balance = balance + amt; // cust balance
	  tcash = tcash + amt;	 // bank cash balance
	 }

	 public void Withdraw( int amt )
	 {
	  if( balance - amt < 0 )
	    System.out.println("Not enough cash\n");
	  else
	  {
	   balance = balance - amt;
	   tcash = tcash - amt;
	  }
	 }

	 public void Balance()
  	 {
	  System.out.println("Your balance = " + balance);
	 }

	 public static void Report()
	 {
	  System.out.println("--------<< Report >>--------");
	  System.out.println("Customer count     :" + cnt );
	  System.out.println("Total cash balance :" +  tcash);
	  System.out.println("-----------------------------");
	}

	}

	class staticExample
	{
	public static void main(String v[])
	{

	  Bank sam = new Bank();
	  Bank john = new Bank();

		sam.Deposit(3000);//sam.withdraw(4000);
		john.Deposit(5000);

	  sam.Balance();
	  john.Balance();

	  Bank.Report();
	}
	}
	
