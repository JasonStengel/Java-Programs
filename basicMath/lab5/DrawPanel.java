package lab5;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.*;

public class DrawPanel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	private Random randomNumbers = new Random ();
	private MyLine[] lines;
	private MyOval[] ovals;
	private MyRectangle[] rectangle;
	

	// when time to paint the panel, draw the lines
	public void paintComponent (Graphics g) {
		// paint the parent first
		super.paintComponent (g);
		// draw the lines using the enumerated for
		// statement
		for (MyLine line : lines) 
			line.draw (g);
		for (MyOval oval : ovals)
			oval.draw(g);
		for (MyRectangle rectangle : rectangle)
			rectangle.draw(g);
		
	}  // end method paintComponent


	// the constructor
	public DrawPanel () {
		// declare local variables, using constant values where sensible
		final int NUMBER_COLORS = 256;	// (0-255 color values)
		final int WINDOW_WIDTH = 600, WINDOW_HEIGHT = 600;
		int x1,y1,x2,y2;
		Color color;
		boolean Flag;
		
		// set background color
//		setBackground (Color.CYAN);
		setBackground (Color.WHITE);
		
		// allocate the array for MyLine, MyOvals, and MyRectangle objects (5 to 9 references)
		lines = new MyLine [5 + randomNumbers.nextInt (5)];
		rectangle = new MyRectangle [5 + randomNumbers.nextInt (5)];
		ovals = new MyOval [5 + randomNumbers.nextInt (5)];
		
		// create the MyLine objects
		for (int count = 0; count < lines.length; count++) {
			// generate random coordinates (0 to 299)
			x1 = randomNumbers.nextInt (WINDOW_WIDTH);
			y1 = randomNumbers.nextInt (WINDOW_HEIGHT);
			x2 = randomNumbers.nextInt (WINDOW_WIDTH);
			y2 = randomNumbers.nextInt (WINDOW_HEIGHT);
			// display some output
			System.out.printf ("x1=%d, y1 = %d\n", x1, y1);
						
				// generate a random color
			color = new Color (randomNumbers.nextInt (NUMBER_COLORS),
									randomNumbers.nextInt (NUMBER_COLORS),
										randomNumbers.nextInt (NUMBER_COLORS));
						
						// construct a MyLine object
			lines [count] = new MyLine (x1, y1, x2, y2, color);
		}  // end for loop to create MyLine objects
			
		
		for (int count2 = 0; count2 < rectangle.length; count2++) {
			// generate random coordinates (0 to 299)
			x1 = randomNumbers.nextInt (WINDOW_WIDTH);
			y1 = randomNumbers.nextInt (WINDOW_HEIGHT);
			x2 = randomNumbers.nextInt (WINDOW_WIDTH);
			y2 = randomNumbers.nextInt (WINDOW_HEIGHT);
			
			// display some output
			System.out.printf ("x1=%d, y1=%d\n x2=%d, y2=%d\n", x1, y1, x2, y2);
						
						// generate a random color
			color = new Color (randomNumbers.nextInt (NUMBER_COLORS),
									randomNumbers.nextInt (NUMBER_COLORS),
										randomNumbers.nextInt (NUMBER_COLORS));
			
			Flag = randomNumbers.nextBoolean ();
			
						
						// construct a MyRectangle object
			rectangle [count2] = new MyRectangle (x1, y1, x2, y2,color,Flag);
		}  // end for loop to create MyRectangle objects
		
		
		
		
		for (int count1 = 0; count1 < ovals.length; count1++) {
			// generate random coordinates (0 to 299)
			x1 = randomNumbers.nextInt (WINDOW_WIDTH);
			y1 = randomNumbers.nextInt (WINDOW_HEIGHT);
			x2 = randomNumbers.nextInt (WINDOW_WIDTH);
			y2 = randomNumbers.nextInt (WINDOW_HEIGHT);
			
			// display some output
			System.out.printf ("x1=%d, y1 = %d\n x2=%d, y2=%d\n", x1, y1, x2, y2);
						
						// generate a random color
			color = new Color (randomNumbers.nextInt (NUMBER_COLORS),
									randomNumbers.nextInt (NUMBER_COLORS),
										randomNumbers.nextInt (NUMBER_COLORS));
			
			Flag = randomNumbers.nextBoolean ();
						
						// construct a MyOval object
			ovals [count1] = new MyOval (x1, y1, x2, y2,color,Flag);
		}  // end for loop to create MyOval objects
		
	}  // end drawPanel constructor
	

}  // end class DrawPanel
