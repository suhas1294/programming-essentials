class AddData
{
  public static void main(String v[])
  {
    if( v.length != 2 )
      System.out.println("Help: java AddData <no-1> <no-2>");
    else
    {
      int a = Integer.parseInt( v[0] );
      int b = Integer.parseInt( v[1] );
      int c = a + b;
      System.out.println("Sum = " + c );
    }
  }
}