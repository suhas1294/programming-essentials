class FindArea
{
  public static void main(String v[])
  {
    if( v.length != 1)
      System.out.println("Help: java FindArea <radius>");
    else
    {
      double r = Double.parseDouble( v[0] );
      double a = 3.14 * r * r;
      System.out.println("Area = " + a);
    }
  }
}