// MyLine.java.
 //Author: Mike Qualls

package lab5;

import java.awt.Graphics;
import java.awt.Color;

public class MyLine {
	// declare instance variables
	private int x1, y1, x2, y2;
	private Color myColor;
	
	// the constructors
	public MyLine () {
		// the default
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
		this.myColor = Color.BLACK;	
	}  // end default constructor
	public MyLine (int x1, int y1, int x2, int y2, Color color) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.myColor = color;
	}  // end constructor
	
	// sets/gets
	public void setX1 (int x1) {
		this.x1 = x1;
	}
	public void setY1 (int y1) {
		this.y1 = y1;
	}
	public void setX2 (int x2) {
		this.x2 = x2;
	}
	public void setY2 (int y2) {
		this.y2 = y2;
	}
	public void setColor (Color color) {
		this.myColor = color;
	}
	public int getX1 () {
		return x1;
	}
	public int getY1 () {
		return y1;
	}
	public int getX2 () {
		return x2;
	}
	public int getY2 () {
		return y2;
	}
	public Color getColor () {
		return myColor;
	}

	// draw the shape
	public void draw (Graphics g) {
		g.setColor (myColor);
		g.drawLine (getX1 (), getY1 (), getX2 (), getY2 ());
	}  // end method draw
	
}  // end class MyLine


