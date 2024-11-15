package week11;

import java.util.Scanner;

public class GPA {

	static Scanner userinput = new Scanner(System.in);

	static double computeGPA(double[] grades, double[] credits) {
		double gpa, totalCred = 0, totalGrades = 0;
		int i;

		for (i = 0; i < grades.length; i++) {
			totalGrades += (grades[i] * credits[i]);
			totalCred += credits[i];
		}

		gpa = totalGrades / totalCred;

		return gpa;
	}

	public static void main(String[] args) {

		int qCourse, i;

		System.out.println("How many courses would you like to compute for your GPA?");
		qCourse = userinput.nextInt();
		userinput.nextLine();

		double[] my_grades = new double[qCourse];
		double[] my_credits = new double[qCourse];

		for (i = 0; i < qCourse; i++) {
			System.out.println("Enter your grade in a 4.0 scale for course " + (i + 1) + ". --> ");
			my_grades[i] = userinput.nextDouble();
			userinput.nextLine();

			System.out.println("Enter the amount of credits for course " + (i + 1) + ". --> ");
			my_credits[i] = userinput.nextDouble();
			userinput.nextLine();

		}

		System.out.printf("\nYour GPA is %.2f", computeGPA(my_grades, my_credits));

	}

}
