package project2;

import javax.swing.*;
import java.awt.BorderLayout;////
import javax.swing.JLabel;////

public class TestDraw {

	public static void main(String[] args) {
		// declare local variables/objects, using constants for the window dimensions
		final int WINDOW_WIDTH = 600, WINDOW_HEIGHT = 400;
		DrawPanel panel = new DrawPanel ();	// call constructor creating MyLine objects
		JLabel southLabel = new JLabel("Lines: " + panel.getLines() +  "   Ovals: " + panel.getOvals() + "   Rectangles: " + panel.getRects());
		JFrame application = new JFrame ();	// the window and its components
		
		application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		application.add (panel);
		application.add(southLabel, BorderLayout.SOUTH);
		application.setSize (WINDOW_WIDTH, WINDOW_HEIGHT);
		application.setVisible (true);		// show the window
		
	}  // end method main

}  // end class TestDraw