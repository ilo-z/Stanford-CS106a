/*
 * File: Rational.java
 * -------------------
 * This file defines a simple class for representing rational numbers.
 */

/**
 * The Rational class is used to represent rational numbers, which
 * are defined to be the quotient of two integers.
 */
public class RationalSoln {

	/* Private instance variables */

	private int num;	 /* The numerator of this Rational   */
	private int den;	 /* The denominator of this Rational */

	/**
	 * Creates a new Rational initialized to zero.
	 */
	public RationalSoln() {
		// Your code starts here
		this(0);
		// Your code ends here
	}

	/**
	 * Creates a new Rational from the integer argument.
	 * @param n The initial value
	 */
	public RationalSoln(int n) {
		// Your code starts here
		this(n, 1);
		// Your code ends here
	}

	/**
	 * Creates a new Rational with the value x / y.
	 * @param x The numerator of the rational number
	 * @param y The denominator of the rational number
	 */
	public RationalSoln(int x, int y) {
		// Your code starts here
		int g = gcd(Math.abs(x), Math.abs(y));
		num = x / g;
		den = Math.abs(y) / g;
		if (y < 0) num = -num;
		// Your code ends here
	}

	/**
	 * Adds the rational number r to this one and returns the sum.
	 * @param r The rational number to be added
	 * @return The sum of the current number and r
	 */
	public RationalSoln add(RationalSoln r) {
		// Your code starts here
		return new RationalSoln(this.num * r.den + r.num * this.den,
				this.den * r.den);
		// Your code ends here
	}

	/**
	 * Subtracts the rational number r from this one.
	 * @param r The rational number to be subtracted
	 * @return The result of subtracting r from the current number
	 */
	public RationalSoln subtract(RationalSoln r) {
		// Your code starts here
		return new RationalSoln(this.num * r.den - r.num * this.den,
				this.den * r.den);
		// Your code ends here
	}

	/**
	 * Multiplies this number by the rational number r.
	 * @param r The rational number used as a multiplier
	 * @return The result of multiplying the current number by r
	 */
	public RationalSoln multiply(RationalSoln r) {
		// Your code starts here
		return new RationalSoln(this.num * r.num, this.den * r.den);
		// Your code ends here
	}

	/**
	 * Divides this number by the rational number r.
	 * @param r The rational number used as a divisor
	 * @return The result of dividing the current number by r
	 */
	public RationalSoln divide(RationalSoln r) {
		// Your code starts here
		return new RationalSoln(this.num * r.den, this.den * r.num);
		// Your code ends here
	}

	/**
	 * Creates a string representation of this rational number.
	 * @return The string representation of this rational number
	 */
	public String toString() {
		if (den == 1) {
			return "" + num;
		} else {
			return num + "/" + den;
		}
	}

	/**
	 * Calculates the greatest common divisor using Euclid's algorithm.
	 * @param x First integer
	 * @param y Second integer
	 * @return The greatest common divisor of x and y
	 */
	private int gcd(int x, int y) {
		int r = x % y;
		while (r != 0) {
			x = y;
			y = r;
			r = x % y;
		}
		return y;
	}

}
