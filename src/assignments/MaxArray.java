package assignments;

public class MaxArray {

	public static void main(String[] args) {
		    
        int a[]= new int [] {656,342,45,56,78,543,23};  
        int max = a[0];  
        for (int i = 0; i < a.length; i++) {  
           if(a[i] > max)  
               max = a[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
	}

}
