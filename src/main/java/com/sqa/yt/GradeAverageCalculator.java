/**
 * File Name: GradeAverageCalculator.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 19, 2017
 */
package com.sqa.yt;

import com.sqa.yt.helpers.*;

/**
 * GradeAverageCalculator //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class GradeAverageCalculator {

	static double gradeAverage;

	static int numOfGrades;

	static int totalOfGrades;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appName = "Grade Calculator";
		// String name = AppBasics.greetUserAndGetName(appName);
		calculateGrade();
	}

	/**
	 *
	 */
	private static void calculateGrade() {
		numOfGrades = AppBasics.requestIntFromUser("How many grades would you like to input into the system?");
		int i = 1;
		do {
			totalOfGrades += AppBasics.requestIntFromUser("Could i get grade #" + i + ":", 0, 100);
			i++;
		} while (i <= numOfGrades);
		gradeAverage = totalOfGrades / numOfGrades;
		System.out.printf("Based on those grades, you would receive a %.0f%% average.\n", gradeAverage);
	}
}
