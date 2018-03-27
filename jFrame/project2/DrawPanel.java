package project2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	private Random randomNumbers = new Random ();
	private MyLine lines [];
	private MyRectangle rects [];
	private MyOval ovals [];
	static final long serialVersionUID = 0;

	// the constructor
	public DrawPanel () {
		// declare local variables, using constant values where sensible
		final int NUMBER_COLORS = 256;	// (0-255 color values)
		final int WINDOW_WIDTH = 600, WINDOW_HEIGHT = 400;
		int x1, y1, x2, y2;
		Color color;
		boolean Flag;
		
		
		// set background color
		setBackground (Color.WHITE);
		
		// allocate the array for MyLine objects  (1 to 5 references)
		lines = new MyLine [1 + randomNumbers.nextInt (5)];
		rects = new MyRectangle [1 + randomNumbers.nextInt (5)];
		ovals = new MyOval [1 + randomNumbers.nextInt (5)];
		
		
		// create the MyLine objects
		for (int count = 0; count < lines.length; count++) {
			// generate random coordinates (0 to 299)
			x1 = randomNumbers.nextInt (WINDOW_WIDTH);
			y1 = randomNumbers.nextInt (WINDOW_HEIGHT);
			x2 = randomNumbers.nextInt (WINDOW_WIDTH);
			y2 = randomNumbers.nextInt (WINDOW_HEIGHT);
			
			// generate a random color
			color = new Color (randomNumbers.nextInt (NUMBER_COLORS),
							   randomNumbers.nextInt (NUMBER_COLORS),
							   randomNumbers.nextInt (NUMBER_COLORS));
			
			// construct a MyLine object
			lines [count] = new MyLine (x1, y1, x2, y2, color);
		}  // end for loop to create MyLine objects

		// create the MyRectangle objects
		for (int count = 0; count < rects.length; count++) {
			// generate random coordinates (0 to 299)
			x1 = randomNumbers.nextInt (WINDOW_WIDTH);
			y1 = randomNumbers.nextInt (WINDOW_HEIGHT);
			x2 = randomNumbers.nextInt (WINDOW_WIDTH);
			y2 = randomNumbers.nextInt (WINDOW_HEIGHT);
			
			// generate a random color
			color = new Color (randomNumbers.nextInt (NUMBER_COLORS),
							   randomNumbers.nextInt (NUMBER_COLORS),
							   randomNumbers.nextInt (NUMBER_COLORS));
			
			// generate a Flag value
			Flag = randomNumbers.nextBoolean ();
			
			// construct a MyRectangle object
			rects [count] = new MyRectangle (x1, y1, x2, y2, color, Flag);

		}  // end for loop to create MyRectangle objects
		
		// create the MyOval objects
		for (int count = 0; count < ovals.length; count++) {
			// generate random coordinates (0 to 299)
			x1 = randomNumbers.nextInt (WINDOW_WIDTH);
			y1 = randomNumbers.nextInt (WINDOW_HEIGHT);
			x2 = randomNumbers.nextInt (WINDOW_WIDTH);
			y2 = randomNumbers.nextInt (WINDOW_HEIGHT);
			
			// generate a random color
			color = new Color (randomNumbers.nextInt (NUMBER_COLORS),
							   randomNumbers.nextInt (NUMBER_COLORS),
							   randomNumbers.nextInt (NUMBER_COLORS));
			
			// generate a fill value
			Flag = randomNumbers.nextBoolean ();
			
			// construct a MyRectangle object
			ovals [count] = new MyOval (x1, y1, x2, y2, color, Flag);

		}  // end for loop to create MyOval objects
		
	}  // end drawPanel constructor
	
	
	// when time to paint the panel, draw the lines, rectangles, and ovals
	public void paintComponent (Graphics g) {
		// paint the parent first
		super.paintComponent (g);
		
		// draw the lines, rectangles, and ovals using the enumerated for statement
		for (MyLine line : lines) 
			line.draw (g);
		for (MyRectangle rect : rects)
			rect.draw (g);
		for (MyOval oval : ovals)
			oval.draw (g);
	}  // end method paintComponent
	
	
	public int getLines()
	{
		return lines.length;
	}
	
	public int getOvals()
	{
		return ovals.length;
	}
	
	public int getRects()
	{
		return rects.length;
	}
	
}  // end class DrawPanel