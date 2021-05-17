import java.util.Date;
class AgeFinder
{
  public static void main(String v[])
  {
  //int yob = Integer.parseInt(v[0].split("/")[2]);
   String dob[]=v[0].split("/");
   int year=Integer.parseInt(dob[2]);
  //Date d = new Date( );
   int age = 2015  - year;
   System.out.println("Age = " + age );
 }
}