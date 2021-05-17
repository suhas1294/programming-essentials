class divThrowable
{
  public static void main(String v[])
  {
    try
    {
      int a = Integer.parseInt( v[0] );
      int b = Integer.parseInt( v[1] );
      double c = a/b;
      System.out.println("Result = " + c);
    }
    catch( ArrayIndexOutOfBoundsException e )
    {
      System.out.println("Usage: java divData <no-1> <no-2>");
    }
    catch( NumberFormatException e )
    {
      System.out.println("Only numbers are allowed / out of range");
      e.printStackTrace() ;
    }
    catch( ArithmeticException e )
    {
      System.out.println("Divide by zero...");
    }
    System.out.println("Further part of the code...");
  }
}
