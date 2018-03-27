package project2;

import java.awt.Graphics;
import java.awt.Color;

public class MyLine extends MyShape {
	// declare instance variables

	
	// the constructors
	public MyLine () {
		
	}  // end default constructor
	public MyLine (int x1, int y1, int x2, int y2, Color color) {
		super (x1, y1, x2, y2, color);
	}  // end constructor
	
	// sets/gets

	// draw the shape
	public void draw (Graphics g) {
		g.setColor (getMyColor());
		g.drawLine (getX1(), getY1 (), getX2 (), getY2 ());
	}  // end method draw
	
}  // end class MyLine