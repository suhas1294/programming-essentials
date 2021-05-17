

       // <applet code=jload height=250 width=250> </applet>

        import java.io.*;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;


        public class jload extends JApplet implements ActionListener
        {

          JTextField txtFilename;
          JTextArea txtFileContent;
          JLabel lblFilename;
          JButton btn;

          public void init()
          {
            txtFilename = new JTextField( 20 );
            txtFileContent = new JTextArea( 20 , 50 ); //20 rows and 50 columns
            lblFilename = new JLabel("Filename");
            btn = new JButton("Load");

            JPanel p = new JPanel();

            p.add( lblFilename );
            p.add( txtFilename );
            p.add( btn );
	 
	    Container con = getContentPane();

            con.add( BorderLayout.NORTH , p );

	 //   JScrollPane jp = new JScrollPane( txtFileContent, 20, 30);
            con.add( BorderLayout.CENTER , txtFileContent );

            btn.addActionListener(this);
          }

          public void actionPerformed( ActionEvent e )
          {

           try {
           File x = new File( txtFilename.getText() );
           if( x.exists() == false )
           {
				
			  boolean bval = x.setWritable(true);
             System.out.println("set the owner's write permission: "+ bval);

             txtFileContent.setText("File not found...");
             return;
           }
           BufferedReader reader= new BufferedReader( new FileReader( txtFilename.getText()));
           String content="";
           String data;
           while( ( data = reader.readLine() ) != null )
           {
             content = content + data + "\n";
           }

           reader.close();
 
           txtFileContent.setText( content );

           }
           catch( Exception ex )
           {
            txtFileContent.setText( ex.toString() );
           }
         }
       }
