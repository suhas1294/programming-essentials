
package Stdio;

import java.util.*;

public class Console
{

public  int ReadInt()
{
Scanner key = new Scanner(System.in);
int v = key.nextInt();
key.nextLine();  // ignore enter key
return v;
}

public String ReadString()
{
Scanner key = new Scanner(System.in);
String v = key.nextLine();
return v;
}

}