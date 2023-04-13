package Inheritance;

public class Class04  implements inter2,inter1{
	@Override
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		
	}
	@Override
	public void sub() {
		int a=10,b=15;
		System.out.println(b-a);
		
	}

	public static void main(String[] args) {
		Class04 obj=new Class04();
		obj.add();
		obj.sub();
		
		
		

	}

}
