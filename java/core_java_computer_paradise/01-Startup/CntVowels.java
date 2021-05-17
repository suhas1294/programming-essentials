class CntVowels
{
  public static void main(String v[])
  {
    String s = v[0].toLowerCase();
    int c=0;
    for(int i=0; i<s.length();i++)
    {
     char ch = s.charAt(i);
     switch( ch )
     {
       case 'a':
       case 'e':
       case 'i':
       case 'o':
       case 'u':c++;
     }
   }
   System.out.println("Count of vowels = " + c);
 }
}