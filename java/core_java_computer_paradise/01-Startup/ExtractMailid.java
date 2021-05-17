class ExtractMailid
{
  public static void main(String v[])
  {
    int p = v[0].indexOf("@");
    if( p == -1 )
      System.out.println("Invalid mailid");
    else
    {
      String usr = v[0].substring(0,p);
      String pro = v[0].substring(p+1);
      System.out.println("Username :"+ usr );
      System.out.println("Provider :"+ pro );
    }
    String user[]=v[0].split("@");
    System.out.println("Username :"+ user[0] );
    System.out.println("Provider :"+ user[1] );
  }
}