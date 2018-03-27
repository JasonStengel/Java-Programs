package project2;

import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyShape {
	// declare instance variables
	private boolean Flag;
	
	// methods constructors first
	public MyOval () {
		// the default	
		setFlag (true);
	}  // end default constructor

	public MyOval (int x1, int y1, int x2, int y2, Color color, boolean Flag) {
		super (x1, y1, x2, y2, color);
		setFlag (Flag);
	}  // end constructor
	
	// sets/gets

	public void setFlag (boolean Flag) {
		this.Flag = Flag;
	}
	public boolean getFlag () {
		return Flag;
	}

	// do the gets
	public int getUpperLeftX () {
		return Math.min (getX1 (), getX2 ());
	}
	public int getUpperLeftY () {
		return Math.min (getY1 (), getY2 ());
	}
	public int getWidth () {
		return Math.abs (getX1 () - getX2 ());
	}
	public int getHeight () {
		return Math.abs (getY1 () - getY2 ());
	}
	
	// draw the shape
	public void draw (Graphics g) {
		g.setColor (getMyColor ());
		if (Flag)
			g.fillOval (getUpperLeftX (), getUpperLeftY (), getWidth (), getHeight ());
			else
				g.drawOval (getUpperLeftX (), getUpperLeftY (),	getWidth (), getHeight ());
	}  // end method draw
	

}  // end class MyOval

