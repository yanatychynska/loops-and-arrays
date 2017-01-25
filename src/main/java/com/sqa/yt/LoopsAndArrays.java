/**
 * File Name: loopsandarrays.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 19, 2017
 */
package com.sqa.yt;

/**
 * loopsandarrays //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class LoopsAndArrays {

	/**
	 *
	 */
	public static void createLoopsAndArrays() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appName = "Loops and Arrays";
		// String name = AppBasics.greetUserAndGetName(appName);
		countNumbers1To100();
		countNumbers200To100();
		countNumbers10To1000();
		countNumbersEven();
		countNumbersOdd();
		countNumbers30To333();
		// AppBasics.farewellUser(name, appName);
	}

	private static void countNumbers10To1000() {
		// (init; condition; increment)
		for (int i = 10; i <= 1000; i += 10) {
			System.out.print(i);
			if (i < 1000) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");
	}

	/**
	 *
	 */
	private static void countNumbers1To100() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			if (i < 100) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");
	}

	private static void countNumbers200To100() {
		for (int i = 200; i >= 100; i--) {
			System.out.print(i);
			if (i > 100) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");
	}

	private static void countNumbers30To333() {
		int i = 30;
		while (i <= 333) {
			if (i % 3 == 0) {
				System.out.print(i);
				if (i < 333) {
					System.out.print(", ");
				}
			}
			i++;
		}
		System.out.print("\n");
	}

	private static void countNumbersEven() {
		// initializing i and setting 1
		int i = 1;
		// Doing a loop until condition is no longer true
		while (i <= 100) {
			// Check that there is no remainder when dividing by 2 (divisible)
			if (i % 2 == 0) {
				// Print out the number for i for current iteration
				System.out.print(i);
				// Check if the number is not the last number counting to
				if (i < 100) {
					// Print the number if its not the last number
					System.out.print(", ");
				}
			}
			// Increment i by 1 at the end of every iteration
			i++;
		}
		// Print a new line so that next method doesn't start on the same line
		System.out.print("\n");
	}

	/**
	 *
	 */
	private static void countNumbersOdd() {
		int i = 300;
		while (i <= 400) {
			if (i % 2 != 0) {
				System.out.print(i);
				if (i < 399) {
					System.out.print(", ");
				}
			}
			i++;
		}
		System.out.print("\n");
	}
}