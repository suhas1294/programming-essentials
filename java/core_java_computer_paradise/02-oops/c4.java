class person
{
  private int pid;
  private String name;
  person ( int id , String pname )
  {
    pid = id;
    name = pname;
  }
  public String toString()
  {
    return pid + "\t" + name;
  }
}
class Employ extends person
{
  private String job;
  private int salary;
  public Employ( int pid , String name , String jobname , int salVal )
  {
    super( pid , name );
    job = jobname;
    salary = salVal;
  }
  public String toString()
  {
    return super.toString() + "\t" + job + "\t" + salary;
  }
}
class c4
{
  public static void main(String v[])
  {
    Employ e = new Employ( 1 , "Ram" , "Designer", 16000 );
    System.out.println(e);
  }
}
