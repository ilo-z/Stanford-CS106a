/*
 * File: CountLetterFrequencies.java
 * ---------------------------------
 * This program counts the frequency of letters in user-entered text.
 */

import acm.program.*;

/**
 * This program creates a table of the letter frequencies in a 
 * paragraph of input text terminated by a blank line.
 */
public class CountLetterFrequenciesSoln extends ConsoleProgram {

	
	public void run() {
		println("This program counts letter frequencies.");
		println("Enter a blank line to indicate the end of the text.");
		int[] table = initFrequencyTable();
		while (true) {
			String line = readLine();
			if (line.length() == 0) break;
			countLetterFrequencies(table, line);
		}
		printFrequencyTable(table);
	}

/* Initializes the frequency table to contain zeros */
	private int[] initFrequencyTable() {
		int[] frequencyTable = new int[26];
		for (int i = 0; i < 26; i++) {
			frequencyTable[i] = 0;
		}
		return frequencyTable;
	}

/* Counts the letter frequencies in a line of text */
	private void countLetterFrequencies(int[] table, String line) {
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (Character.isLetter(ch)) {
				int index = Character.toUpperCase(ch) - 'A';
				table[index]++;
			}
		}
	}

/* Displays the frequency table */
	private void printFrequencyTable(int[] table) {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int index = ch - 'A';
			println(ch + ": " + table[index]);
		}
	}

}
