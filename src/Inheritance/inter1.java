package Inheritance;

public interface inter1 {
	
	void sub();
	
	default void mul() {
		System.out.println("1234");
	}
	static void div() {
		System.out.println("4321");
	}

}
