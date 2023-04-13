package ExceptionHandling;

public class CT_exception {

	public static void main(String[] args) {
		int a=10,b=0;
		int c;
		c=a+b;
		System.out.println(c);
		c=a-b;
		System.out.println(c);
		try{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae){
			
			System.out.println(ae.toString());
		}
		
		c=a*b;
		System.out.println(c);

	}

}
