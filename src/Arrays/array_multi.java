package Arrays;

public class array_multi {

	public static void main(String[] args) {
		/*String a[][]= new String[2][2];
		a[0][0]="testing tools";
		a[0][1]="Devops";
		a[1][0]="Cloud computing";
		a[1][1]="python";*/
		String a[][]= {{"testing tools","devops"},{"java","cloud"}};
		
		/*int a[][]= new int[2][2];
		a[0][0]=12;
		a[0][1]=34;
		a[1][0]=45;
		a[1][1]=56;*/
		//int a[][]= {{12,23},{23,34}};


		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length;j++)
		  {
		 
		 
		System.out.print(a[i][j] + " ");
		  }

	}

}
}