package practice_java;

public class Operators {

	public static void main(String[] args) {
		int a,b,c;
		a=5;b=3;c=8;
		
		// And operator
	    System.out.println((a > b) && (c > a));  // true
	    System.out.println((a > b) && (c < a));  // false

	    // Or operator
	    System.out.println((a < b) || (c > a));  // true
	    System.out.println((a > b) || (c < a));  // true
	    System.out.println((a < b) || (c < a));  // false

	    // Not operator
	    System.out.println(!(a == b));  // true
	    System.out.println(!(a > b));  // false

	}

}
