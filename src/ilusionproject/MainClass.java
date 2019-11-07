package ilusionproject;


import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton lineWidth1;
    JButton lineWidth2;
    JButton lineWidth3;
    JLabel label1;
    JLabel label2;
    static int t=1;
    
public MainClass()  {
	lineWidth1 =new ButtonChange("2,5 px","1");
	
	lineWidth2 = new ButtonChange("5 px","2");
	lineWidth3 = new ButtonChange("7,5 px","3");
	label1 = new JLabel("");
	label2 = new JLabel("");
	this.setBackground(Color.white);
	JPanel panel= new JPanel();
	this.setLayout(new GridLayout(3,1,5,5));
	this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	panel.setLayout(new GridLayout(1,3,5,5));
	panel.add(lineWidth1);
	panel.add(lineWidth2);
	panel.add(lineWidth3);
	add(label1);
	add(panel);
	add(label2);
}


	public static void main(String[] args) {
		 JFrame f = new JFrame();
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	     
	        f.add(new MainClass());
	        f.setSize(350,400);
	        f.setBackground(Color.white);
	        f.setVisible(true);

	}

}
