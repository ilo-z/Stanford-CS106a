/*
 * File: HelloConsole.java
 * -----------------------
 * This program displays the message "hello, world" and is inspired
 * by the first program "The C Programming Language" by Brian
 * Kernighan and Dennis Ritchie.  This version displays its message
 * using a console window.
 */

import acm.program.*;

public class HelloConsole extends ConsoleProgram {

	public void run() {
		println("Hello, world");
	}

/* Standard Java entry point */
/* This method can be eliminated in most Java environments */
/*	public static void main(String[] args) {
		new HelloConsole().start(args);
	}*/
}
