package org.staff;
import org.col.College;
import org.stu.Student;
public class Staff{
	protected void Staff_Name() {
		// TODO Auto-generated method stub
System.out.println("Kannan");
	}
protected void Staff_Dept() {
	// TODO Auto-generated method stub
System.out.println("Computer Application");
}
public static void main(String[] args) {
	Staff data  = new Staff();
	Student s= new Student();
	College c = new College();
	data.Staff_Name();
	data.Staff_Dept();
	s.Student_Dept();
	s.Student_Name();
	c.college_Name();
}
}
