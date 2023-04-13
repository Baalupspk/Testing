package Arrays;

public class Arrays {
	
	public static void main(String[] args) {
//	

		//multi
		int x[][]=new int [2][3];
		x[0][0]=2;
		x[0][1]=12;
		x[0][2]=15;
		x[1][0]=345;
		x[1][1]=78;
		x[1][2]=90;
		
		System.out.println(x.length);
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				System.out.println(x[i][j]);
			}
		}
		


		
		
		
	}
	

}
