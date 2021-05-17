
	// <applet code=SysAppx height=100 width=100> </applet>


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class SysAppx extends JApplet implements ActionListener
	{

	JLabel lbl;
	JTextField txt;
	JButton btn;

	public void init( )
	{
	lbl = new JLabel("System date and time");
	txt = new JTextField(20);	
	btn = new JButton(new ImageIcon("btn.jpg"));
	btn.setToolTipText("Click to get system date and time");
	
	
	Container con = getContentPane();
	con.setLayout( new FlowLayout());
	con.add( lbl );
	con.add( txt );    // add components on applet
	con.add( btn );

	btn.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{

	java.util.Date d = new java.util.Date();
	txt.setText( d.toString() );

	}
	
	}
	

