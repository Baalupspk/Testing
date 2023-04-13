package practice_java;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter your marks: ");
	    double marks = input.nextDouble();
	    // marks is greater than 40
	    String result = (marks >= 35) ? "pass" : "fail";

	    System.out.println("You " + result + " the exam.");

	}

}
