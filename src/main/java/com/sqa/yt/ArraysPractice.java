/**
 * File Name: ArraysPractice.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
package com.sqa.yt;

import java.util.*;

/**
 * ArraysPractice //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class ArraysPractice {

	public static void charExercise() {
		// Form1
		char[] letters = { 'y', 'e', 'd', 't' };
		for (char i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
		// Form2
		char[] digits;
		digits = new char[5];
		digits[0] = '3';
		digits[1] = '5';
		digits[2] = '4';
		digits[3] = '2';
		digits[4] = '6';
		for (char c : digits) {
			System.out.println(c);
		}
	}

	public static void parameterArray(int[] intArray) {
		System.out.println("The size of this array is " + intArray.length);
	}

	public static void parameterStringArray(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
	}

	public static void sampleArrays() {
		int[] numbers = new int[5];
		numbers[0] = 4;
		numbers[1] = 8;
		numbers[2] = 9;
		numbers[3] = 1;
		numbers[4] = 0;
		String[] words = { "yanat", "iana", "yt", "yana" };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
