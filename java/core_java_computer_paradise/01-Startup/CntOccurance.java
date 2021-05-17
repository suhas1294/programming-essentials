class CntOccurance
{
  public static void main(String v[])
  {
    String s = "search engine enables to find , search engine using google is simple , search engine introduces for web application , google is fast enough to deliver content , easy to use compared to yahoo but we can use yahoo for mailing and addressbook";
    String word = v[0];
    int p = -1;
    while( true )
    {
      p = s.indexOf( word , p+1);
      if( p == -1) break;
      System.out.println( p );
    }
  }
}
