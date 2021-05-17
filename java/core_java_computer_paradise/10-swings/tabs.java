
        import javax.swing.*;
        import java.awt.*;
         import java.util.*;
        import java.awt.event.*;

        public class tabs extends JApplet
        {

         public void init()
         {
           JTabbedPane tab = new JTabbedPane();

           tab.add("Settings", new c1() );
           tab.add("Report", new c2() );

           Container con = getContentPane();
           JScrollPane jsp = new JScrollPane( tab , 20 , 30 );
           con.add( jsp );
         }
        }


        class c1 extends JPanel 
        {
            c1()
            {
             JLabel l1 = new JLabel("India");
             add(l1);
            }
        }

        class c2 extends JPanel implements ActionListener
        {

           JTextField tf;

           c2()
          {
	tf = new JTextField(20);
	add( tf );
            	
	JButton ok = new JButton("Time");
	 add(ok);
                   ok.addActionListener(this);
           }

	    public void actionPerformed( ActionEvent e )
	   {
		tf.setText( new Date().toString() );
	    }

        }

        // <applet code=tabs height=350 width=350> </applet>
