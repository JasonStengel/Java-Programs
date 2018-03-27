package project2;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyShape {
	// declare instance variables

	private boolean Flag;
	
	
	public MyRectangle () {
		// the default
	
		setFlag (true);
	}  // end constructor
	public MyRectangle (int x1, int y1, int x2, int y2,	Color color, boolean Flag) {
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
			g.fillRect (getUpperLeftX (), getUpperLeftY (),getWidth (), getHeight ());
		else
			g.drawRect (getUpperLeftX (), getUpperLeftY (),getWidth (), getHeight ());
	}  // end method draw
	

}  // end class MyRectangle