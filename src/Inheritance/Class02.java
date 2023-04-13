package Inheritance;

public class Class02 extends Class01{
	void mul() {
		int a=10,b=20;
		System.out.println(a*b);
	}
	void div() {
		int a=20,b=5;
		System.out.println(a/b);
	}
public static void main(String[] args) {
	Class01 obj=new Class01();
	obj.add();
	obj.sub();
}
	
}
