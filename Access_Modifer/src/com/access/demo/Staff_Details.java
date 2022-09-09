package com.access.demo;
public class Staff_Details {
	public void staff_Number() {
		System.out.println("12");
	}

	public void staff_Names() {
		System.out.println("Barath,Sharmi,Jasmin");
	}

	public static void main(String[] args) {
		Student_Details details = new Student_Details();
		Teacher_Details teacher = new Teacher_Details();
		Staff_Details staff = new Staff_Details();
		details.Student_Mobile_Number();
		details.student_Name();
		details.student_Register_Number();
		teacher.teacher_Qualification();
		teacher.best_Teacher();
		staff.staff_Names();

	}

}
