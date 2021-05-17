

import java.awt.*;
import java.awt.event.*;

public class _7Calc_Frames_StandAlone extends Frame implements ActionListener {

	Label l1, l2, l3;
	TextField t1, t2, t3;
	Button b1, b2, b3, b4;

	public _7Calc_Frames_StandAlone() {
		super("Simple ver 1.0"); // invoking base class constructor
		l1 = new Label("A      :");
		l2 = new Label("B      :");
		l3 = new Label("Result :");

		setLayout(new FlowLayout());

		b1 = new Button("Add");
		b2 = new Button("Diff");
		b3 = new Button("Mul");
		b4 = new Button("Div");

		t1 = new TextField(20);
		t2 = new TextField(20);
		t3 = new TextField(20);

		t3.setEditable(false);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		setSize(200, 350);
		show();

		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
	}

	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		double result;

		if (e.getSource() == b1)
			result = a + b;
		else if (e.getSource() == b2)
			result = a - b;
		else if (e.getSource() == b3)
			result = a * b;
		else
			result = (double) a / b;

		t3.setText(String.valueOf(result));
	}

	public static void main(String v[]) {
		_7Calc_Frames_StandAlone c = new _7Calc_Frames_StandAlone();
	}

}
