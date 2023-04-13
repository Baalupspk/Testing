package assignments;

public class fibonacci_for {

	public static void main(String[] args) {
		int n=5, fibonacci=0, s=1;
		System.out.println("Fibonacci Series till "+n+":");
		for(int i=1;i<=n; i++) {
			System.out.print(fibonacci+",");
			int next=fibonacci+s;//0+1=1,1+1=2,1+2=3,2+3=5,3+5=8,5+8=13,8+13=21
			fibonacci=s;         //    1,    1,    2,    3,    5,     8,     13
			s=next;      //    1,    2,    3,    5,    8     13
		}

	}

}// 0 1 1 2 3 5 8
