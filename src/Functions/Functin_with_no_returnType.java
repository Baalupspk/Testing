package Functions;

public class Functin_with_no_returnType {
public void add()
	
	{
		int x=10;
		int y=20;
		int z;
		z=x+y;
		System.out.println(z);
		
	}
	
	public void sub()
	{
		int x=20;
		int y=40;
		int z=x-y;
		System.out.println(z);
	}
	
	public void Mul()
	{
		int x=20;
		int y=40;
		int z=x*y;
		System.out.println(z);
	}
	public static void main(String[] args)
	{
		Functin_with_no_returnType a=new Functin_with_no_returnType();
		a.add();
		a.sub();
		a.Mul();
	}


}
