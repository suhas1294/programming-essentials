	import javax.swing.*;
	import java.io.*;
	import java.awt.*;
	import java.util.*;
	import java.awt.event.*;

	public class markstab1 extends JApplet implements ActionListener
	{
	JButton btn;
	JTable tab;

	public void init( )
	{
	btn = new JButton("Save");
	try
	{
	  ArrayList L = new ArrayList( );
	  BufferedReader reader = new BufferedReader( new FileReader("e:/marks.txt"));
	
 	 String dt;
	 while( ( dt = reader.readLine() ) != null)
	 L.add( dt );
	 reader.close();
		

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
		
	tab = new JTable(data , header);

	JScrollPane jsp = new JScrollPane( tab , 20 , 30 );

	Container con = getContentPane();
	con.add( BorderLayout.CENTER , jsp );
	con.add( BorderLayout.SOUTH , btn );
	btn.addActionListener(this);

	}
	catch( Exception e ) { System.out.println(e);} 
	}

	public void actionPerformed(ActionEvent e )
	{
	    try
		{
		PrintWriter p = new PrintWriter(new FileWriter("e:/marks.txt") );

		int rows = tab.getRowCount();

		for(int i=0; i<rows; i++)
		{
			String f1 = (String)tab.getValueAt( i , 0 ); // regno
			String f2 = (String)tab.getValueAt( i , 1 ); // name
			String f3 = (String)tab.getValueAt( i , 2 ); // marks-1
			String f4 = (String)tab.getValueAt( i , 3 ); // marks-2
			p.println( f1 + "," + f2 + ","  + f3 + "," + f4 );
		}

		p.close();
		}
		catch( Exception err )
		{
		  System.out.println( err );
		}
	}

	}

	// <applet code=markstab1 height=200 width=200> </applet>



	

		

	  
	

	

	
	