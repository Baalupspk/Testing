package assignments;

import java.util.Scanner;

public class factorial {
	public  void facto() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
	    int num=sc.nextInt();
	    int i,fact=1;
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+num+" is:"+fact);
	}

	public static void main(String[] args) {
	    factorial f=new factorial();
	
		f.facto();
		

	}

}
