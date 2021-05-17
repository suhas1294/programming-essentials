import java.util.*;
class scanInput
{
  public static void main( String v[])
  {
    Scanner key = new Scanner( System.in );
    System.out.println("Enter regno");
    int regno = key.nextInt();
    key.nextLine(); // read enter key in keyboard buffer
    System.out.println("Enter name");
    String name = key.nextLine();
    System.out.println("-------------------");
    System.out.println("Regno        :" + regno);
    System.out.println("Name         :" + name);
    System.out.println("-------------------");
  }
}