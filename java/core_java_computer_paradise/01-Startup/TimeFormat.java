 class TimeFormat
 {
   public static void main(String v[])
   {
     if( v.length != 3 )
       System.out.println("Usage: java TimeFormat hour min sec");
     else
     {
      int h = Integer.parseInt( v[0] );
      int m = Integer.parseInt( v[1] );
      int s = Integer.parseInt( v[2] );
      if( h < 12 )
        System.out.println( h + ":" + m + ":" + s + " AM");
      else if( h == 12 )
        System.out.println( h + ":" + m + ":" + s + " PM");
      else
        System.out.println( (h-12) + ":" + m + ":" + s + " PM");
    }
  }
}