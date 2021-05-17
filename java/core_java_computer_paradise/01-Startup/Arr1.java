 class Arr1
 {
   public static void main(String v[])
   {
    int max = Integer.parseInt(v[0]);
    int a[] = new int[ max ];
    for(int i=0; i<max; i++)
    {
      a[i] = 1;
      System.out.print( a[i] +"\t");
    }
  }
}