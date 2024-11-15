package week11;

import java.util.Scanner;

public class UltimateCompMenu {
	static Scanner userinput = new Scanner(System.in);

	static void dispayApp() {

	}

	static void textArtApp() {

	}

	static void calculatorApp() {

	}

	static void binaryCalculatorApp() {

	}

	static void ecouragementApp() {

	}

	static void diceApp() {

	}

	static void fibonacciApp() {

	}

	static void facialRecognitionApp() {

	}

	static void doubleFactorialApp() {

	}

	public static void main(String[] args) {

		int selection;
		String cond = "yes";

		try {

			while (cond.equals("yes") || cond.equals("Yes")) {

				System.out.println("Select the program you would like to run. (1-9)");
				System.out.println("1) Display APP (week #1)");
				System.out.println("2) Text Art APP (week #1)");
				System.out.println("3) Calculator APP (week #3)");
				System.out.println("4) Binary Calculator APP (week #3)");
				System.out.println("5) Encouragement APP (week #4)");
				System.out.println("6) Dice APP (week #5)");
				System.out.println("7) Fibonacci APP (week #7)");
				System.out.println("8) Facial Recognition APP (week #9");
				System.out.println("9) Double Factorial APP (week #11)");

				// I am printing what the method call would be, as a placeholder
				// so that the code will run
				selection = userinput.nextInt();
				userinput.nextLine();

				if (selection == 1) {
					System.out.println("displayAPP()");
				}
				if (selection == 2) {
					System.out.println("textArtAPP()");
				}
				if (selection == 3) {
					System.out.println("calculatorAPP()");
				}
				if (selection == 4) {
					System.out.println("binaryCalculatorAPP()");
				}
				if (selection == 5) {
					System.out.println("ecouragementAPP()");
				}
				if (selection == 6) {
					System.out.println("diceAPP()");
				}
				if (selection == 7) {
					System.out.println("fibonacciAPP()");
				}
				if (selection == 8) {
					System.out.println("facialRecognitionAPP()");
				}
				if (selection == 9) {
					System.out.println("doubleFactorialAPP()");
				}

				System.out.println("Would you like to run another program? (yes/no) -->");
				cond = userinput.nextLine();

			}

		} catch (Exception e) {
			System.out.println("An error occured, please restart the program and try again.");

		} finally {
			System.out.println("\nProgram ending...");
		}

	}

}
