package project2;

import java.awt.Color;

public abstract class MyShape
{
   private int x1, y1, x2, y2;
   private Color myColor;

	// the constructors
	public MyShape () {
		// the default
		setX1 (0);
		setY1 (0);
		setX2 (0);
		setY2 (0);
		setMyColor (Color.BLACK);	
	}  // end default constructor
	public MyShape (int x1, int y1, int x2, int y2, Color color) {
		setX1 (x1);
		setY1 (y1);
		setX2 (x2);
		setY2 (y2);
		setMyColor (color);	
	}  // end constructor
	
	// sets/gets
		public void setX1 (int x1) {
			if (x1 >= 0)
				this.x1 = x1;
				else
					this.x1 = 0;
		}
		public void setY1 (int y1) {
			if (y1 >= 0)
				this.y1 = y1;
				else
					this.y1 = 0;
		}
		public void setX2 (int x2) {
			if (x2 >= 0)
				this.x2 = x2;
				else
					this.x2 = 0;
		}
		public void setY2 (int y2) {
			if (y2 >= 0)
				this.y2 = y2;
				else
					this.y2 = 0;
		}
		public void setMyColor (Color color) {
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
		public Color getMyColor () {
			return myColor;
		}
		
		public String toString () {
			return String.format("x1 = %d,  x2 = %d, y1 = %d, y2 = %d, color = %s", x1, y1, x2, y2, myColor);
		}


} // end class MyShape