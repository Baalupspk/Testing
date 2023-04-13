package Polymorphism;

public class RT_poly {
	void add(int x, int y)
	{
		System.out.println(+(x+y));
		
	}
	void add(String a, String b)
	{
		String c=a+b;
		System.out.println(c);
	}
public static void main(String[] args)

{
	CT_poly a1=new  CT_poly();
	a1.add();
	a1.add("java");
	a1.add(8.092, 14.25);
	a1.add(18,34);
	a1.add("testing ","tools");
	
	RT_poly a2=new RT_poly();
	a2.add(12, 23);
	a2.add("manual ","testing");
	



}

}
