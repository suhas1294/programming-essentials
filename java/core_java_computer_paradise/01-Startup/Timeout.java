import java.util.Date;
class Timeout
{
  public static void main( String v[]) throws InterruptedException
  {
    Date d = new Date();
    System.out.println( "Start time " + d.toString());
    int h = d.getHours();
    int m = d.getMinutes();
    int s = d.getSeconds();
    while( true )
    {
      ++s;
      if( s == 60 )
      {
        s=0;
        m++;
        if( m == 60 )
        {
         m = 0;
         h++;
         if( h == 24 )
          h = 0;
      }
    }
    System.out.print( h + ":" + m + ":" + s + "\r");
    Thread.sleep(1000);// 1000ms = 1sec
  }
}
}