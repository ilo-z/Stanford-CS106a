import acm.program.*;
import acm.util.*;
import java.applet.*;
import java.awt.Color;
import java.io.*;
import java.util.*;

import acm.graphics.*;

public class OpeningCrawlSoln extends GraphicsProgram {

	/* Make the window large so that we can see more detail. */
	public static final int APPLICATION_WIDTH = 800;
	public static final int APPLICATION_HEIGHT = 1200;

	/* Filename constants
	 * Public domain image from http://www.publicdomainpictures.net/pictures/130000/velka/night-sky-background-14391263141jp.jpg
	 * Public domain soundtrack from https://commons.wikimedia.org/wiki/File:Gustav_Holst_-_the_planets,_op._32_-_i._mars,_the_bringer_of_war.ogg
	 */
	private static final String CRAWL_TEXT_FILENAME = "opening-crawl.txt";
	private static final String CRAWL_MUSIC_FILENAME = "music.au";

	/* How much padding is put in between each label */
	private static final double LABEL_PADDING = 15;

	private static final double PAUSE_TIME = 20;

	public void run() {
		addMusicAndBackground();

		// Create GLabels from the text file
		ArrayList<GLabel> labelsList = readOpeningCrawlFile(CRAWL_TEXT_FILENAME);

		// 1. TODO: Initally place labels on screen
		double y = getHeight();
		for (int i = 0; i < labelsList.size(); i++) {
			GLabel currentLabel = labelsList.get(i);

			double x = getWidth() / 2.0 - currentLabel.getWidth() / 2.0;
			add(labelsList.get(i), x, y);

			y += currentLabel.getAscent() + LABEL_PADDING;
		}

		// 2. TODO: Animate labels up the screen
		while(true) {
			// update
			for(GLabel label : labelsList) {
				label.move(0, -1);
			}
			
			// pause
			pause(PAUSE_TIME);
		}

	}

	private void addMusicAndBackground() {
		// Play the background music
		AudioClip music = MediaTools.loadAudioClip(CRAWL_MUSIC_FILENAME);
		music.play();

		// Add our background image
		GImage bg = new GImage("background.jpg");
		bg.setSize(getWidth(), getHeight());
		add(bg, 0, 0);
	}

	/* This method returns an ArrayList containing a GLabel for each line in the
	 * given file.  The GLabels are in the same order as the lines in the text file.
	 */
	private ArrayList<GLabel> readOpeningCrawlFile(String crawlFilename) {
		try {
			Scanner input = new Scanner(new File(crawlFilename));

			ArrayList<GLabel> labelsList = new ArrayList<GLabel>();

			while (input.hasNextLine()) {
				String line = input.nextLine();

				// TODO: Do something with line
				GLabel label = new GLabel(line);
				label.setFont("Courier New-bold-32");
				label.setColor(Color.WHITE);
				labelsList.add(label);

			}
			input.close();
			return labelsList;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
