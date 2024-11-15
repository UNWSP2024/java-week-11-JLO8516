package week11;

import java.util.Scanner;

public class DoubleFactorial {

	static int doubleFactorial(int num) {

		if (num <= 1) {
			return 1;
		}

		return doubleFactorial(num - 2) * num;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);

		int value;

		try {

			System.out.println("Enter the integer(1-20) that you would like to calculate the double factorial of.");
			value = userinput.nextInt();
			userinput.nextLine();
			System.out.println("The double factorial of " + value + " is " + doubleFactorial(value));
		} catch (Exception e) {
			System.out.println(
					"An error occured. Please re-run the program, and make sure to only input an integer between 1-20.");
		} finally {
			System.out.println("\nProgram ending...");
		}

	}

}
