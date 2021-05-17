import java.util.Scanner;
import java.util.Arrays;
class Arr2
{
  public static void main(String v[])
  {
    Scanner key = new Scanner( System.in );
    System.out.println("Enter array size");
    int max = key.nextInt();
    int [] a = new int [ max ];
    System.out.println("Enter elements");
    for(int i=0; i<a.length; i++)
      a[i] = key.nextInt();
    Arrays.sort(a); // ascending order
    System.out.println("Sorted list");
    for(int i=0; i<a.length; i++)
      System.out.println(a[i] );
    System.out.println("Enter element to search");
    int x = key.nextInt();
    int p= Arrays.binarySearch( a , x );
    if(p <  0)
      System.out.println("Not found");
    else
      System.out.println("Found at position " + p);
  }
}
