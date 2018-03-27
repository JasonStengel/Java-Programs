package lab5;

import java.awt.Color;
import java.awt.Graphics;

//get upperLeft x,y
//get width
//get height

public class MyRectangle{
	// declare instance variables
	private int x1, y1, x2, y2;
	private Color myColor;
	private boolean Flag;

	// the constructors
	public MyRectangle () {
		// the default
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
		this.myColor = Color.BLACK;	
		setFlag (true);
	}  // end default constructor
	public MyRectangle (int x1, int y1, int x2, int y2, Color color, boolean Flag) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.myColor = color;
		setFlag(Flag);
	}  // end constructor
	
	public void setFlag (boolean Flag) {
		this.Flag = Flag;
	}
	public boolean getFlag () {
		return Flag;
	}
	
	
	
	
	// sets/gets
	public void setx1 (int x1) {
		this.x1 = x1;
	}
	public void sety1 (int y1) {
		this.y1 = y1;
	}
	public void setx2(int x2) {
		this.x2 = x2;
	}
	public void sety2 (int y2) {
		this.y2 = y2;
	}
	public void setColor (Color color) {
		this.myColor = color;
	}
	public int getupperleftx () {
		return Math.min(x1,x2);
	}
	public int getupperlefty () {
		return Math.min(y1, y2);
	}
	public int getwidth () {
		return (x2-x1);
	}
	public int getheight () {
		return (y2-y1);
	}
	public Color getColor () {
		return myColor;
	}

	// draw the shape
	public void draw (Graphics g) {
		g.setColor (myColor);
		if (Flag)
			g.fillRect (getupperleftx (), getupperlefty (), getwidth (), getheight ());
			else
				g.drawRect (getupperleftx (), getupperlefty (),	getwidth (), getheight ());
	}// end method draw
	
}  // end class MyLine