package assignments;

import java.util.Scanner;

public class powerOf {
	double x,y,result;
	Scanner sc=new Scanner(System.in);

	public void power()
	{
		System.out.println("Enter a number:");
		x=sc.nextInt();
	    System.out.println("Enter power value: ");
	    y=sc.nextInt();
	    result=Math.pow(x, y);
	    
		System.out.println(x+"^"+y+" is "+result );
	}

	public static void main(String[] args) {
		powerOf p=new powerOf();
		p.power();

	}

}
