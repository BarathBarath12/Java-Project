package org.stu.details;

import org.emp.details.Employee;

public class Student extends Employee {
	@Override
	public void employee_Name() {
		// TODO Auto-generated method stub
		super.employee_Name();
	}
	private void student_Id() {
		// TODO Auto-generated method stub
System.out.println("1212323");
	}
	public static void main(String[] args) {
		Student data = new Student();
		data.employee_Id();
		data.employee_Name();
		data.student_Id();
	}
}
