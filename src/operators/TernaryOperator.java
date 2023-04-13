package operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter your marks: ");
	    int marks = input.nextInt();
	    // marks is greater than 35
	    //condition-exp1-exp2
	    String result = (marks >= 35) ? "pass" : "fail";

	    System.out.println("You " + result + " the exam.");

	}

}
