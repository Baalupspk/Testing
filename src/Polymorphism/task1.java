package Polymorphism;

//public class task1 {
//
//	public static void main(String[] args) {
//		Royal roy=new Royal();
//        roy.m1(); 
// 
//        task rom=new task ();
//        rom.m1 ();
// 
//        task a2 = new Royal ();
//        a2.m1 ();
//	}
//
//}
 class task1{

int x=10;
}
class C extends task1 {
int y=30;


public static void main (String args []) {
	task1 b=new task1();
System.out.println(b.x);

C c=new C ();
System.out.println(c.y);

}
}

