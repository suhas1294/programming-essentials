import java.util.*;
class conversionD2B
{
  public static void main(String v[])
  {
    int num = Integer.parseInt( v[0] );
    Stack s = new Stack();
    while( num!=0 )
    {
      int rem = num % 2;
      s.push( new Integer( rem ) );
      num = num / 2;
    }
    while( !s.empty() )
      System.out.print( s.pop() );
  }
}