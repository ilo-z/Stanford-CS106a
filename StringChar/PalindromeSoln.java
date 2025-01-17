/*
 * File: Palindrome.java
 * ---------------------
 * This program tests to see whether a string is a palindrome, which
 * is defined to be a string that reads the same forwards and backwards.
 */

import acm.program.*;

/**
 * This class tests to see whether a string is a palindrome.
 * This version tests the characters individually.
 */

public class PalindromeSoln extends ConsoleProgram {

	/** Runs the program */
	public void run() {
		println("This program tests whether a string is a palindrome.");
		// Your code starts here
		while (true) {
			String str = readLine("Enter a string: ");
			if (str.length() == 0) break;
			if (isPalindrome(str)) {
				println("That string is a palindrome.");
			} else {
				println("That string is not a palindrome.");
			}
		}
		// Your code ends here
	}

	/** Checks whether a string is a palindrome */
	private boolean isPalindrome(String str) {
		boolean answer = false;
		// Your code starts here
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			reverse = str.charAt(i) + reverse;
		}
		answer = reverse.equals(str);
		// Your code ends here
		return answer;
	}	

}

