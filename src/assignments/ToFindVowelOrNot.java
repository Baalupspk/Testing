package assignments;

import java.util.Scanner;

public class ToFindVowelOrNot {

	public static void main(String[] args) {
	int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a charactor: ");
	char ch = sc.next().charAt(i);
	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='I'||ch=='O'||ch=='U') {
		System.out.println("Entered charector "+ch+" is Vowel");
	}else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	{
		System.out.println("Entered character "+ch+" is Consonant");
	}else {
		System.out.println("Not a alphabet");
	}

	}

}
