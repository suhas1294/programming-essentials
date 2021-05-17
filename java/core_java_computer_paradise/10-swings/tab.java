


	import javax.swing.*;
	import java.awt.*;

	public class tab extends JApplet
	{


	public void init( )
	{
	
	String heading[] = {"Cityname" , "Stdcode"};
	
	Object data[][] = {
				{"Mysore", "0821"},
				{"Bangalore","080"},
				{"Mandya", "08233"}
			};

	JTable tab = new JTable(data , heading);

	JScrollPane jsp = new JScrollPane( tab , 20 , 30 );

	Container con = getContentPane();
	con.add( jsp );
	}

	}

	// <applet code=tab height=200 width=200> </applet>
