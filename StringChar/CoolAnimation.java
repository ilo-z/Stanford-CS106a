/*
 * File: CoolAnimation.java
 * ---------------------
 * This program creates a scroll like animation for the given text.
 */

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

/**
 * This class creates a scroll like animation for the given text.
 */

public class CoolAnimation extends GraphicsProgram {

	/** Runs the program */
	public void run() {

		/* Do not change this part of the code */
		setSize(WIDTH,HEIGHT);
		GLabel label = new GLabel(labelText);
		label.setFont("SansSerif-48");
		centerLabel(label);
		add(label);
		pause(PAUSE_TIME);

		for(int i = 0; i < labelText.length()-1; i++){
			remove(label);
			String l = labelText.substring(i+1);
			String a = labelText.substring(0,i+1);
			label = new GLabel(l + a);
			label.setFont("SansSerif-48");
			centerLabel(label);
			add(label);	 
			pause(PAUSE_TIME);
			
		}
	}

	/** 
	 * This method centers label in the window.
	 * You do NOT need to modify this method. Just use it.
	 **/
	private void centerLabel(GLabel label) {
		double x = (getWidth() - label.getWidth())/2;
		double y = (getHeight() + label.getAscent())/2;
		label.setLocation(x, y);
	}

	/* Do not change this part of the code */
	private static final String labelText = "HELLO"; 
	private static final int PAUSE_TIME = 500;
	private static final int WIDTH = 300;
	private static final int HEIGHT = 150;
}

