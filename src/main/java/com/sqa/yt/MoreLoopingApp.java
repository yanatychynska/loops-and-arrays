/**
 * File Name: MoreLoopingApp.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 20, 2017
 */
package com.sqa.yt;

/**
 * MoreLoopingApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class MoreLoopingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appName = "More Looping";
		firstLoop();
		secondLoop();
		thirdLoop();
		fourthLoop();
		loopThroughStars();
	}

	/**
	 *
	 */
	private static void firstLoop() {
		for (int i = 10; i >= 5; i--) {
			System.out.print(i);
			if (i > 5) {
				System.out.print(", ");
			}
			System.out.println();
		}
	}

	/**
	 *
	 */
	private static void fourthLoop() {
		for (int i = 9999; i >= 1111; i = i / 3) {
			if (i >= 1111) {
				System.out.print("{{{{-" + i);
			}
		}
	}

	/**
	 *
	 */
	private static void secondLoop() {
		for (int i = 0; i <= 5; i++) {
			System.out.print("[" + i + "]");
			if (i < 5) {
				System.out.print(", ");
			}
			System.out.println();
		}
	}

	/**
	 *
	 */
	private static void thirdLoop() {
		for (int i = 1000; i >= 8; i = i / 5) {
			if (i >= 8) {
				System.out.print(i);
				if (i > 8) {
					System.out.print("<<<");
				}
			}
		}
	}

	/**
	 *
	 */
	static void loopThroughStars() {
		int numberOfStars = 6;
		int numberOfLines = 6;
		for (int i = 0; i < numberOfLines; i++, numberOfStars--) {
			for (int j = 0; j < numberOfStars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
