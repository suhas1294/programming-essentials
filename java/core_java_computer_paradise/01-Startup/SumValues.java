class SumValues
{
  public static void main(String v[])
  {
    String vals[]= v[0].split(",");
    int s=0;
    for(int i=0; i<vals.length; i++)
      s = s+ Integer.parseInt( vals[i] );
    System.out.println("Sum = " + s);
  }
}