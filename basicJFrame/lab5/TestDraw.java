// TestDraw.java.
// Author: Jason Stengel


package lab5;

import javax.swing.*;

public class TestDraw {

	public static void main(String[] args) {
		// declare local variables/objects, using constants for the window dimensions
		final int WINDOW_WIDTH = 600, WINDOW_HEIGHT = 600;
		DrawPanel panel = new DrawPanel ();	// call constructor creating MyLine, MyOval, and MyRectangle objects
		JFrame application = new JFrame ();	// the window and its components
		
		application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		application.add (panel);
		application.setSize (WINDOW_WIDTH, WINDOW_HEIGHT);
		application.setVisible (true);		// show the window
		
	}  // end method main

}  // end class TestDraw

