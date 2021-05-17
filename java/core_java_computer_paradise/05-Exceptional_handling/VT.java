import java.util.*;
class MyError extends Exception
{
  String msg;
  public MyError( String message )
  {
    msg = message;
  }
  public String toString()
  {
    return msg;
  }
}
class VT
{
  public static void main(String v[])
  {
    try
    {
      int yob = Integer.parseInt( v[0] );
      Calendar c = Calendar.getInstance();
      if( yob < 0 )
        throw new MyError("Year of birth can't be negative");
      if( yob >  c.get( Calendar.YEAR ) )
        throw new MyError("Year of birth can't be greater than current year");
      int age = c.get( Calendar.YEAR ) - yob;
      System.out.println("Your age = " + age );
      if( age >=18 )
        System.out.println("You can vote");
      else
        System.out.println("You are still kid wait for " + (18-age) + " years");
    }
    catch( ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Usage: java VT <year>");
    }
    catch( MyError e )
    {
      System.out.println(e);
    }
    catch( NumberFormatException e )
    {
      System.out.println("Year of birth can be only integers");
    }
  }
}