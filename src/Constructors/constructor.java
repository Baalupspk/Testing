package Constructors;

public class constructor{
	
	int  a;

	 
	constructor(int x){
		x=a;
		System.out.println(a);
	}
	void sum() {
		 System.out.println(a);
	 }

	public static void main(String[] args) {
		constructor obj=new constructor(10);
		constructor obj1=new constructor(20);
		obj.sum();
		obj1.sum();
	
		
		
		
		
	}

}
