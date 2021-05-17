import java.util.Random;
class CardGen
{
  public static void main(String v[])
  {
    Random r = new Random();
    for(int i=1; i<=16; i++)
    {
     int d = r.nextInt(10);
     System.out.print(d);
     if( i % 4 == 0 && i != 16 ) System.out.print("-");
   }
   System.out.println("\n\n");
 }
}