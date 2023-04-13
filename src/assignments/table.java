package assignments;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		int a;
		int c;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	a=sc.nextInt();
	for(int b=1;b<=10;b++) {
		 c=a*b;
		System.out.println(c+"*"+b+"="+c);
		
	}

	}

}
