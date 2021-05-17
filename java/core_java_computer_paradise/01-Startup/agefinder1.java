import java.util.Calendar;
class agefinder1
{
  public static void main(String v[])
  {
    int yob = Integer.parseInt(v[0].split("/")[2]);
    Calendar d = Calendar.getInstance();
    int age = d.get( Calendar.YEAR ) - yob;
    System.out.println("Age = " + age );
  }
}