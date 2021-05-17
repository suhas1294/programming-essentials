// <applet code=tree height=230 width=250> </applet>

import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
import java.io.*;
import javax.swing.event.*;

public class tree extends JApplet implements TreeSelectionListener
{
JTree T = null;
JTextArea content =null;


public void init()
{
 DefaultMutableTreeNode h = new DefaultMutableTreeNode("Hardware");
 h.add( new DefaultMutableTreeNode("Printer") );
 h.add( new DefaultMutableTreeNode("Monitor"));

 DefaultMutableTreeNode s = new DefaultMutableTreeNode("Software");
 s.add(  new DefaultMutableTreeNode("Ms-Office") );
 s.add(  new DefaultMutableTreeNode("Office suite"));

DefaultMutableTreeNode cf = new DefaultMutableTreeNode("Java files");
File f = new File("c:/tc/bin");
String fnames[] = f.list();
for(int i=0; i<fnames.length; i++)
       if( fnames[i].endsWith(".java") || fnames[i].endsWith(".txt"))
cf.add( new DefaultMutableTreeNode( fnames[i] ));

 DefaultMutableTreeNode c = new DefaultMutableTreeNode("Computer");
   c.add( h  );
   c.add( s  );
   c.add( cf );

T= new JTree( c );

 Container con = getContentPane();
 JScrollPane jsp = new JScrollPane( T , 20 , 30 );
 con.add( BorderLayout.WEST , jsp );

 content = new JTextArea( 20 , 40 );
 JScrollPane jsp1 = new JScrollPane( content , 20 , 30 );
 con.add( BorderLayout.CENTER , jsp1 );


 T.addTreeSelectionListener(this);
}

public void valueChanged(TreeSelectionEvent e )
{

try
{
		String fileName="c:/tc/bin/"+ T.getLastSelectedPathComponent().toString();

	 BufferedReader reader = new BufferedReader( new FileReader(fileName) );
 
 String scontent = "";
 String data=null;

 while( ( data = reader.readLine()) != null )
 {
  scontent = scontent + data + "\n";
 }

 reader.close();

 content.setText( scontent );
 }
 catch( Exception ex)  { }

}

}		

