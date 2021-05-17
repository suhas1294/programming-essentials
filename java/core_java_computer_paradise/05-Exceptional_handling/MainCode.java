class MyError extends Exception
{
  String msg;
  public MyError( String msg )
  {
    this.msg = msg;
  }
  public String toString()
  {
    return msg;
  }
}

class Company
{
  private int h , m;
  public void Login( int H , int M ) throws MyError
  {
    if( H < 0 || H > 24 || M < 0 || M > 60 )
      throw new MyError("Invali d timestamp");
    h = H;
    m = M;
    System.out.println("Your login successfull");
  }
  public void LoggedInTime()
  {
    System.out.println( "Login time --> " + h + ":" + m);
  }
}

class MainCode
{
  public static void main(String v[])
  {
    try
    {
      int h = Integer.parseInt(v[0]);
      int m = Integer.parseInt(v[1]);
      Company c = new Company();
      c.Login( h , m );
      c.LoggedInTime();
    }
    catch( MyError e )
    {
      System.out.println(e);
    }
    catch( ArrayIndexOutOfBoundsException e )
    {
      System.out.println("Please send login time from command line");
    }
    catch( NumberFormatException e )
    {
      System.out.println("Time can be only numbers");
    }
  }
}
