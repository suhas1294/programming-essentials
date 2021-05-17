

import Stdio.*;

class rrExample
{

public static void main(String v[])
{
 
Console c = new Console();
System.out.println("Enter empno");
int empno =  c.ReadInt();

System.out.println("Enter name");
String name =  c.ReadString();

System.out.println("---------------------");
System.out.println("Employ number :" + empno );
System.out.println("Employ name   :" + name);
System.out.println("---------------------");

}
}
