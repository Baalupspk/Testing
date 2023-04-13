package Constructors;

public class defa {
	int a;
	int b;
	defa(){
		a=10;
		b=20;
	}
	void add(){
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		defa obj=new defa();
		obj.add();
		
		

	}

}
