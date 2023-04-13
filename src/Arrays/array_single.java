package Arrays;

public class array_single {

	public static void main(String[] args) {
		//int a[]=new int[4];
		//int a[]= {12,23,34,45};
		//String a[]= {"testing tools","Devops","Cloud computing","python"};
		  String a[]= new String[4];
		  
		  a[0]="testing tools";
		  a[1]="Devops";
		  a[2]="Cloud computing";
		  a[3]="python";


//		a[0]=23;
//		a[1]=34;
//		a[2]=45;
//		a[3]=56;
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+ " ");
		 
		}


	}

}
