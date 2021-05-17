import java.util.*;
class AddBig
{
  public static void main(String v[])
  {
    Scanner key = new Scanner(System.in);
    System.out.println("Enter first number");
    String n1 = key.nextLine();
    System.out.println("Enter second number");
    String n2 = key.nextLine();
    LinkedList L1 = new LinkedList();
    LinkedList L2 = new LinkedList();
    LinkedList L3 = new LinkedList();
    for(int i=0; i<n1.length(); i++)
    {
      String digit = n1.substring(i,i+1);
      L1.addFirst( digit );
    }
    for(int i=0; i<n2.length(); i++)
    {
      String digit = n2.substring(i,i+1);
      L2.addFirst( digit );
    }
    int i=0 , j=0 , carry=0;
    while( i<L1.size() && j<L2.size() )
    {
      int r = Integer.parseInt((String)L1.get(i)) + Integer.parseInt((String)L2.get(j)) + carry;
      L3.addFirst( String.valueOf(r % 10 ) );
      carry = r / 10;
      i++;
      j++;
    }
    LinkedList T;
    int ndx;
    if( L1.size() > L2.size())
    {
      T = L1;
      ndx = i;
    }
    else
    {
      T = L2;
      ndx = j;
    }
    while( ndx < T.size() )
    {
      int r = Integer.parseInt((String)T.get(ndx)) + carry;
      L3.addFirst( String.valueOf(r % 10 ) );
      carry = r / 10;
      ndx++;
    }
    if( carry != 0)
      L3.addFirst( String.valueOf(carry) );
    System.out.println("Result \n\n");
    for(int k=0; k<L3.size(); k++)
      System.out.print( L3.get(k) );
  }
}