package com.hiercical;
public class Emp_Details extends Student_Details  {
public void empname() {
	// TODO Auto-generated method stub
System.out.println("Ram");
}
public  void emp_Performance() {
	// TODO Auto-generated method stub
System.out.println("good");
}
private void empsalary() {
	// TODO Auto-generated method stub
System.out.println("12,000");
}
public static void main(String[] args) {
	Emp_Details data = new Emp_Details();
	data.emp_Performance();
	data.empsalary();
	data.student_Record();
	data.studentname();
}
}
