class classify
{
  public static void main(String v[])
  {
    String site = v[0].toLowerCase();
    if( site.endsWith(".com"))
      System.out.println("Commerical site");
    else if( site.endsWith(".edu"))
      System.out.println("Educational site");
    else
      System.out.println("Some other category");
  }
}