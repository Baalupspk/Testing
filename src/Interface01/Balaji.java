package Interface01;

public class Balaji implements Additions{

	@Override
	public void add2num() {
		int a,b;
		a=10;
		b=15;
		System.out.println(a+b);
		
	}

	@Override
	public void add3num() {
		int a=10,b=15,c=20;
		System.out.println(a+b+c);
		
	}
	public void sub() {
		int x=10,y=20;
		System.out.println(x-y);
	}

	@Override
	public void add4num() {
		int a=10,b=15,c=20,d=25;
		System.out.println(a+b+c+d);
		
	}
	public void mul(){
		int l=10,m=20;
		int n=l*m;
		System.out.println(n);
	}

}
