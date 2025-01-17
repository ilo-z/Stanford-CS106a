/*
 * File: Histogram.java
 * --------------------
 * This program generates list of exam scores.
 * It then displays a histogram of those scores, divided into the
 * ranges 0-9, 10-19, 20-29, and so forth, up to the range containing
 * only the value 100.
 */

import acm.program.*;
import acm.util.*;

public class Histogram extends ConsoleProgram {	

	/* Private instance variables */
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		println("This program generates random grades and computes its histogram");		
		//Take grade count and generate random grades
		int gradeCount = readInt("How many students? ");
		double[] grades = generateRandomGrades(gradeCount);
		printGrades(grades);
		int[] histogram = createHistogram(grades);
		printHistogram(histogram);
	}

	/* Generates random grades based on argument */
	private double[] generateRandomGrades(int gradeCount) {
		double[] grades = new double[gradeCount];
		// Your code starts here
		for(int i = 0; i < grades.length; i++){
			grades[i] = rgen.nextDouble(0,100);
		}
		// Your code ends here
		return grades;
	}

	/* Creates a histogram from the array of scores */
	private int[] createHistogram(double[] grades) {
		int[] histogram = new int[11];
		// Your code starts here
		for (int i=0;i<grades.length;i++){
			int range = (int) Math.round(grades[i])/10;
			histogram[range]++;
		}
		// Your code ends here
		return histogram;		
	}


	/* Displays the histogram */
	private void printHistogram(int[] histogram) {
		for (int i = 0; i < histogram.length; i++) {
			int min = i * 10;
			int max = (i+1) * 10 - 1;
			if (min<100) print(min + "-" + max + ": ");
			else print(min+ ": ");
			for (int j = 0; j < histogram[i]; j++) {
				print("*");
			}
			println("");
		}		
	}

	/* Prints scores of the all students */
	private void printGrades(double[] grades){
		println("Student Grades:");
		print("[ ");
		for (int i = 0; i < grades.length; i++) {
			print(((int) (10*grades[i])/10.0) + " ");
		}
		println("]");
	}
}

