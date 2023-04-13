package Conditional_Statements;

public class NestedIf {

	public static void main(String[] args) {
		int a=25;
		if(a>0)
		{
			if(a%5==0) {
				System.out.println("It is a multiple of 5");
			}
			System.out.println("Its a positive number");
		}
	}	
}
