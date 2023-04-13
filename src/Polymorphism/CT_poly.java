package Polymorphism;

public class CT_poly {
	void add()
	{
    	System.out.println("null paramters");
	}
    	void add(int x, int y)
    	{
        	System.out.println(+(x+y));
        	
    	}
 
    	void add(String a, String b)
    	{
        	String c;
        	System.out.println(a+" "+b);
        	
    	}
    	void add(String c)
    	{
        	System.out.print(c);
    	}
    	void add(double c, double d)
    	{
        	System.out.println(c+d);
        	
    	}
    	public static void main(String[] args)
    	{
        	 CT_poly a1=new  CT_poly();
        	 a1.add();
        	 a1.add(12,23);
        	 a1.add("testing","tools");
        	a1.add(15,12.025);
        	a1.add("Java");
            	
    	}
	}



