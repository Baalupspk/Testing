package Functions;

public class fun_NoReturn_withParameter {
public void add(int x, int y)
	
	{
		int z;
		z=x+y;
		System.out.println(z);
		
	}
	
	public void sub(int x, int y )
	{
		int z=x-y;
		System.out.println(z);
	}
	
	public void Mul(int x, int y )
	{
		int z=x*y;
		System.out.println(z);
	}
	public static void main(String[] args)
	{
		fun_NoReturn_withParameter a=new fun_NoReturn_withParameter();
		a.add(10,20);
		a.sub(20,10);
		a.Mul(20,10);
	}

}
