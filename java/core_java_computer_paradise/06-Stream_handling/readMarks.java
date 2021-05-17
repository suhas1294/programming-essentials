
import java.io.*;
import java.util.*;

 class readMarks
 {
 public static void main(String v[])throws Exception
 {
 try
 {
  BufferedReader reader = new BufferedReader( new FileReader("marks.txt"));
  String data;
	System.out.println("Reg No\t Name\t c1 \tc2");
    while( ( data = reader.readLine() )!=null)
    {
	String s[] = data.split(",");
	
	for(int i=0;i<s.length;i++)
	{
	System.out.print(s[i]+"\t");
	Thread.sleep(50);
	}
	System.out.print("\n");
    }
	
    reader.close();	
 }
 catch( FileNotFoundException e )
 {
   System.out.println("Data file missing");
   return;
 }

 }
 }