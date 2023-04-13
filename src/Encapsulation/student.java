package Encapsulation;

public class student{
	int rollNum;
	String name;
	private boolean IsAttended;
	student(int rollnum){
		this.rollNum=rollnum;
	}
	void setStudentAttendence(boolean flag) {
		if(!IsAttended)
		IsAttended=flag;
		System.out.println("student is attended");
	}
	boolean getStudentAttendence() {
		System.out.println("teacher get the attendence");
		return IsAttended;
	}
	
	

}
