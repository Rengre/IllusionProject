package ilusionproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class LineDraw extends JPanel {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Line> lines = new ArrayList<Line>();
	    int liczbaelementow =0;
	    Line l = null;
	    Random randX = new Random();
	    Random randY = new Random();
	    static int x;
	    static int y;
	    static int thick=1;
	    JButton save;
	    JLabel label;
	public LineDraw(int val)  {
		thick=val;
		x=randX.nextInt(300);
		y=randY.nextInt(300);
		l = new Line();
		save = new JButton("Zapisz wyniki");
		label =new JLabel ("Kliknij myszk¹ na bia³ym obszarze");
    	this.setBackground(Color.white);
    	JPanel panel= new JPanel();
    	this.setLayout(new  BorderLayout());
    	panel.setLayout(new  BorderLayout());
    	panel.add(BorderLayout.NORTH,save);
    	panel.add(BorderLayout.SOUTH,label);
    	add(BorderLayout.NORTH,panel);
    	
		ActionListener saveData = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				label.setText("Twoje wyniki to:  bok x="+Math.abs(Line.a)+ " , " + "bok y= "+Line.b + " \n  Zamknij okienko");
				  try {
					  FileWriter file = new FileWriter("data"+thick+".txt",true);
					  BufferedWriter out=new BufferedWriter(file);
					  out.write(Math.abs(Line.a)+"	"+Line.b+"\r\n");
					  out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
		    	}
				
		};
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
     	label.setText("Stwórz kwadrat, klikaj¹c myszk¹ w lewo lub prawo"
     			+ " Gdy bedziesz pewny, ¿e linie tworz¹ kwadrat zapisz swoje wyniki, klikaj¹c przycisk 'Zapisz wyniki'");
            	l.setX(x);
            	l.setY(y+30);
            	l.setX2(e.getX());
            	lines.add(l);
            	repaint();
			}
        });

        save.addActionListener(saveData);
	}
        public void paintComponent(Graphics g) {
            super.paintComponent(g);              
            for(Line pr : lines){
            	pr.paintComponent(g);
            }
            repaint();
        }  



}
