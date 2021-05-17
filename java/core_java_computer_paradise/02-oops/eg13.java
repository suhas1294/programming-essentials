import java.util.*;
class Person
{
  private String name;
  private int age;
  public void setName(String n)
  {name = n;}
  public String getName()
  {return name;}
  public void setAge( int a )
  {age = a;}
  public int getAge()
  { return age; }
  public String toString()
  {
    return name + "\t" + age;
  }
}
class eg13
{
  public static String generateName()
  {
    Random r = new Random();
    String name = r.nextInt(2)==0 ? "Mr." : "Ms.";
    for(int i=1; i<=8; i++)
      name = name + ((char)(65+r.nextInt(26)));
    return name;
  }
  public static int generateAge()
  {
    Random r = new Random();
    return r.nextInt( 100 );
  }
  public static void main(String v[])
  {
    int max = Integer.parseInt( v[0] );
    Person p[] = new Person[max];
    for(int i=0; i<max; i++)
    {
      p[i] = new Person();
      p[i].setName(generateName());
      p[i].setAge(generateAge());
      System.out.println( p[i] );
    }
    System.out.println("\n\nVoters list\n\n");
    for(int i=0; i<max; i++)
    {
      if( p[i].getAge() >= 18 )
        System.out.println( p[i].toString() );
    }
  }
}