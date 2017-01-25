/**
 * File Name: FunctionsArraysWork.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 22, 2017
 */
package com.sqa.yt;

/**
 * FunctionsArraysWork //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class FunctionsArraysWork {

	/**
	 * @param args
	 */
	public static void exerciseFirst() {
		int[] array1 = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] array2 = new int[4];
		int[] array3 = new int[5];
		for (int i : array1) {
			System.out.println(i);
		}
		for (int i2 = 0; i2 < array2.length; i2++) {
			System.out.println(i2);
			for (int i1 = 0; i1 < array3.length; i1++) {
				System.out.println(i1);
			}
		}
	}

	public static void exerciseSecond() {
		int[] arraynum = new int[4];
		char[] arraychar = new char[] { 'y', 'e', 'd', 'i' };
		String[] arraystring = new String[] { "yana", "dima", "emilia", "iana" };
		for (int i = 0; i < arraystring.length; i++) {
			System.out.println(i);
			for (int i1 = 0; i1 < arraychar.length; i1++) {
				System.out.println(i1);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		exerciseFirst();
		exerciseSecond();
	}
}
