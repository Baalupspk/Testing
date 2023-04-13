package assignments;

public class fibonacci_while {

	public static void main(String[] args) {
		int n=10, f=0, s=1;
		System.out.println("Fibonacci Series till "+n+":");
		int i=1;
		while(i<=n) {
			System.out.print(f+",");
			int next=f+s;//0+1=1,1+1=2,1+2=3,3+2=5,
			f=s;         //    1,    1,    2,    3,
			s=next;      //    1,    2,    3,    5,
			i++;
		}


	}

}
