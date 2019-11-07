package ilusionproject;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;


public class Line {
	
	    private int xPos = 50;
	    Random r = new Random();
	    int nLine=r.nextInt(20)+10;
	    private int yPos = 50;
	    private int x2Pos =20;
	    static int a;
	    static int b;
	    public int getX() {
			return xPos;
		}

		public void setX(int xPos) {
			this.xPos = xPos;
		}

	   

	    public void setY(int yPos){
	        this.yPos = yPos;
	    }

	    public int getY(){
	        return yPos;
	    }

	    public int getX2(){
	        return x2Pos;
	    } 

		public void setX2(int x2) {
			this.x2Pos = x2;
		}


		public void paintComponent(Graphics g){
		//	super.paintComponent(g);
			 Graphics2D g2d = (Graphics2D) g;
	        g2d.setColor(Color.black);
	        for(int i=0;i<nLine;i++) {
	        	BasicStroke bs1 = new BasicStroke(LineDraw.thick);
	        g2d.setStroke(bs1);
	        g2d.drawLine(xPos,yPos+i*10,getX2(),yPos+i*10);
	        a=xPos-getX2();
	        b=i*10;
	        }
	        
	    }

	}


