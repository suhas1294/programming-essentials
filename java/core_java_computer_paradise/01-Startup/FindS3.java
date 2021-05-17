class FindS3
{
  public static void main(String v[])
  {
    if( v.length == 3 )
    {
      int a = Integer.parseInt( v[0] );
      int b = Integer.parseInt( v[1] );
      int c = Integer.parseInt( v[2] );
      int s = Math.min( Math.min(a,b) , c );
      System.out.println("Smallest = " + s);
    }
    else
      System.out.println("Please input 3 numbers");
  }
}