

	import javax.swing.*;
	import java.io.*;
	import java.awt.*;
	import java.util.*;

	public class markstab extends JApplet
	{

	public void init( )
	{
	try
	{
	  ArrayList L = new ArrayList( );
	  BufferedReader reader = new BufferedReader( new FileReader("e:/marks.txt"));
	
 	 String dt;
	 while( ( dt = reader.readLine() ) != null)
	 L.add( dt );



	Object data[ ][ ] = new Object[ L.size() ][ 5] ;
	
	for(int i=0; i<L.size(); i++)
	{
	  String record = (String) L.get(i);
	  String vals[ ] = record.split(",");
		
	  data[ i ] [0] = vals[0];	// regno
	  data[ i ] [1] = vals[1];	// name
	  data[ i ] [2] = vals[2];	// test-1
	  data[ i ] [3] = vals[3];	// test-2
	  data[ i ] [4] = String.valueOf(Integer.parseInt( vals[2] ) + Integer.parseInt( vals[3] ) );
	}

	String header[ ] = {"Regno", "Name", "Test-1", "Test-2" , "Total"};
		
	JTable tab = new JTable(data , header);

	JScrollPane jsp = new JScrollPane( tab , 20 , 30 );

	Container con = getContentPane();
	con.add( jsp );
	}
	catch( Exception e ) { System.out.println(e);} 
	}
	}

	// <applet code=markstab height=200 width=200> </applet>



	

		

	  
	

	

	
	