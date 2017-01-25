/**
 * File Name: ArraysPracticetest.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
package com.sqa.yt;

import org.junit.*;

/**
 * ArraysPracticetest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class ArraysPracticeTest {

	@Test
	public void testCalculateArray() {
		String[] items = { "chocolate", "cookie", "ice-cream", "donuts" };
		ArraysPractice.parameterStringArray(items);
	}

	@Test
	@Ignore
	public void testCharExercise() {
		ArraysPractice.charExercise();
	}

	@Test
	@Ignore
	public void testPArray1() {
		int[] myArray = { 1, 2, 3, 4, 5, 6 };
		ArraysPractice.parameterArray(myArray);
	}

	@Test
	@Ignore
	public void testPArray2() {
		int[] myArray = { 9, 8, 7 };
		ArraysPractice.parameterArray(myArray);
	}

	/**
	 * Test method for {@link com.sqa.yt.ArraysPractice#sampleArrays()}.
	 */
	@Test
	@Ignore
	public void testSampleArrays() {
		ArraysPractice.sampleArrays();
	}
}
