package assignments;

public class even_OddNumber {
	public void even() {
		for(int i=2;i<=100;) {
			
			System.out.print(i+", ");
			//i=i+2;
			i+=2;
			
		}
	}
	public void odd() {
		for(int j=1;j<=100;) {
			System.out.print(j+", ");
			//j=j+2;
			j+=2;
		}
	
	}

	public static void main(String[] args) {
		even_OddNumber EO=new even_OddNumber();
		EO.odd();
		System.out.println(" ");
		EO.even();

	}

}
