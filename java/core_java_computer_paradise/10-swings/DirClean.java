 
	// <applet code=DirClean height=250 width=250> </applet>

	import javax.swing.*;
	import java.io.*;
	import java.awt.*;
	import java.awt.event.*;

	public class DirClean extends JApplet implements ActionListener , Runnable
	{

	JLabel lbl;
	JButton b1 , b2;
	JTextField tf;
	JProgressBar jb;
	Thread th;
	String fnames[];
	JLabel status;

	public void init( )	
	{
	  lbl = new JLabel("Directory");
	  b1 = new JButton("Ok");
	  b2 = new JButton("Cancel");
	  tf = new JTextField(20);

	  th = new Thread(this);

	  JPanel p = new JPanel();
	  p.add( lbl );
	  p.add( tf  );
	  p.add( b1 );	
	  p.add( b2 );
	
	  Container con = getContentPane();
	  con.add( BorderLayout.NORTH , p );

	  jb = new JProgressBar();
	  status = new JLabel();


	  con.add( BorderLayout.SOUTH , jb);	
	  con.add( BorderLayout.CENTER , status);

	  b1.addActionListener(this);
	  b2.addActionListener(this);
	}
	  
	public void actionPerformed(ActionEvent e)
	{
	  if( e.getSource()==b1)
	  {
	    File f = new File( tf.getText() );
	    if( f.exists() == false )
	    {
  	      System.out.println("Directory name not found");
	      System.exit(0);
	    }

	    fnames = f.list();  // get file list.

	    jb.setMinimum(1);
	    jb.setMaximum( fnames.length );		
	    b1.setEnabled( false );
	    th.start();
	 }
	 else
	 {
		th.stop();
	 }

	 }
	
	 public void run()
	 {
	  for(int i=0; i<fnames.length; i++)
	  {
		File x = new File(tf.getText() + "\\" + fnames[i]);
		x.delete();
		jb.setValue( i );

		status.setText( String.valueOf( (i*100)/fnames.length ) + "% completed");

		try
		{
		 Thread.sleep(5); // 1000ms = 1sec
		}
		catch( InterruptedException e) { }
	  }
	  status.setText( "100% completed");


	 }

	}
		
	
