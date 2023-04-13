package Encapsulation;

public class test2 {

	public static void main(String[] args) {
		student s=new student(101);
		//s.IsAttended=true;
		s.setStudentAttendence(false);
		s.getStudentAttendence();

	}

}
