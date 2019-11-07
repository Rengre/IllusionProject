package ilusionproject;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;



public  class ButtonChange extends JButton implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean wcisniety = true;
String y;
	ButtonChange(String x, String t) {
		super("Test "+t);
		y=x;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (wcisniety)
			setText(y);
		
		if (y!="2,5 px" & y!="5 px") {
			JFrame f = new JFrame();
	        f.add(new LineDraw(10*3/4));
	        f.setSize(950,700);
	        f.setBackground(Color.white);
	        f.setVisible(true);
		}
		if (y!="2,5 px" & y!="7,5 px") {
			JFrame f = new JFrame();
	        f.add(new LineDraw(10*1/2));
	        f.setSize(950,700);
	        f.setBackground(Color.white);
	        f.setVisible(true);
		}
		if (y!="5 px" & y!="7,5 px") {
			JFrame f = new JFrame();
	        f.add(new LineDraw(10*1/4));
	        f.setSize(950,700);
	        f.setBackground(Color.white);
	        f.setVisible(true);
		}
	}

	

	
}
