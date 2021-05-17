import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class _8_1Redirect1_Frame extends Applet implements ActionListener {

	public void init() {
		Label label= new Label("Page 1");
		add(label);
				
		Button button = new Button("clk");
		button.addActionListener(this);
		add(button);
	}

	public void actionPerformed(ActionEvent event) {
		_8_2Redirect2_Frame obj = new _8_2Redirect2_Frame();
		obj.setVisible(true);
		obj.setSize(250, 300);
		
	}

}
