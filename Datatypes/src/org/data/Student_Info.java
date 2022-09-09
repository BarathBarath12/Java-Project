package org.data;

public class Student_Info {
	private void studentname() {
		// TODO Auto-generated method stub
		String name = "barath";
		System.out.println("Student name : "  + name);
	}

	private void student_Rollnumber() {
		// TODO Auto-generated method stub
		int number = 1334223;
		System.out.println("Rollnumber is : " + number);
	}

	private void studentrank() {
		// TODO Auto-generated method stub
		int rank = 1;
		
		System.out.println("rank is : " + rank);
	}

	private void sudent_Father_Name() {
		// TODO Auto-generated method stub
		String name = "Kumar ";
		char initial = 's';
		System.out.println("Father name is : " + name + initial);
	}

	private void studentfees() {
		// TODO Auto-generated method stub
		float fees = 4300.22f;
		System.out.println("fees is : " + fees);
	}

	public static void main(String[] args) {
		Student_Info data = new Student_Info();
		data.student_Rollnumber();
		data.studentname();
		data.sudent_Father_Name();
		data.studentrank();
		data.studentfees();
	}
}
