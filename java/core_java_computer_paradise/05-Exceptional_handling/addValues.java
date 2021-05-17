import java.util.*;
class addValues
{
  public static void main(String v[])
  {
    Scanner key = new Scanner( System.in );
    int s=0;
    System.out.println("Please input 10 numbers");
    for(int i=1; i<=10; i++)
    {
      try
      {
        s = s + key.nextInt();
        key.nextLine(); // ignore enter key
      }
      catch( InputMismatchException e )
      {
        System.out.println("Please input only number");
        key.nextLine(); // ignore enter key
        --i;
      }
    }
    System.out.println("Sum of number = " + s);
  }
}