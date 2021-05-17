import java.util.*;
class TimeTableApps
{
  public static void main(String v[])
  {
   String [][][] T = new String[3][6][4];
   String subjects[] = {"C++", "Free", "Java", "SE", "CE", "ADA", "DS", "SA", "DB", "C#", "GE", "MT", "RX"};
   Random r = new Random();
   for(int t=0; t<=2; t++)
   {
    System.out.println("Timetable of teacher-" + (t+1));
    for(int d=0; d<=5; d++)
    {
      for(int h=0; h<=3; h++)
      {
        T [t][d][h] = subjects [ r.nextInt(subjects.length) ];
        System.out.print( T [t][d][h] + "\t");
      }
      System.out.println("");
    }
   }
  }
}
