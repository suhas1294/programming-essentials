
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _8_2Redirect2_Frame extends Frame {

	public _8_2Redirect2_Frame() {
		JLabel label = new JLabel("Page 2");
		add(label);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		_8_2Redirect2_Frame page2 = new _8_2Redirect2_Frame();
	}
}
