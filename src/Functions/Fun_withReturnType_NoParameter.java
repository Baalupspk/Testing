package Functions;

public class Fun_withReturnType_NoParameter {
public int add( )
	
	{
		int x=10;
		int y=20;
		int z;
		z=x+y;
		System.out.println(z);
		
		return z;
	}
	
	public int sub ()
	{
		int x=10;
		int y=20;
		
		int z=x-y;
		System.out.println(z);
		return z;
		
	}
	
	public int Mul()
	{
		int x=10;
		int y=40;
		
		int z=x*y;
		System.out.println(z);
		return z; 
	}
	public static void main(String[] args)
	{
		Fun_withReturnType_NoParameter a=new Fun_withReturnType_NoParameter();
		int rt=a.add();
		System.out.println("addition of two values is :"+rt);
		
		int rt1=a.sub();
		System.out.println("subtraction of two values:"+rt1);

		int rr2=a.Mul();
		System.out.println("multiplication of two values is: "+rr2);
		
	
	}

}
