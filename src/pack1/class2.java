package pack1;

import java.util.Scanner;

public class class2 {
public static void main(String[] args) {
	
	double x,y,result;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	x=sc.nextInt();
    System.out.println("Enter power value: ");
    y=sc.nextInt();
    result=Math.pow(x, y);
    
	System.out.println(x+"^"+y+" is "+result );
  }
}
