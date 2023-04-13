package assignments;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		int x, y, z;
		
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number of rows:");
	x=sc.nextInt();
	int a[]=new int[x];
	int b[]={13,13,13};
	System.out.println("array length is "+a.length);
	
	for(z=0;z<a.length;z++) {
		System.out.println("enter a number:");
		y=sc.nextInt();
		a[z]=y;
		
			
		}
	for(int i=0;i<a.length;i++)
	{
	System.out.print(a[i]+ " ");
	 
	}

		
	
		
	}
	
	

	}


