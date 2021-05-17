import java.util.*;
class MobileServer
{
  private int cval;
  public MobileServer()
  {
    cval = 10;
  }
  public MobileServer( int v )
  {
    cval = v;
  }
  public String toString()
  {
    return cval + " Rs Balance";
  }
  public void call(String mobile)
  {
    if( cval == 0 )
      System.out.println("Not enough balance");
    else
    {
      System.out.println("Call connected to number " + mobile );
      cval--;
    }
  }
  public void Recharge( int v )
  {
    cval+=v;
  }
}
class eg11
{
  public static void main(String v[])
  {
    MobileServer s1 = new MobileServer();
    MobileServer s2 = new MobileServer(50);
    Random r =new Random();
    for(int i=1; i<=5; i++)
    {
      String mobile="+919";
      for(int j=1; j<=9; j++)
        mobile+=r.nextInt(10);
      s1.call(mobile);
    }
    System.out.println(s1);
    System.out.println(s2);
    s1.Recharge(100);
    System.out.println(s1);
    System.out.println(s2);
  }
}