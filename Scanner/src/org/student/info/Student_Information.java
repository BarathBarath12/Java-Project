package org.student.info;

import java.util.Scanner;

public class Student_Information {

	public static void main(String[] args) {
		Scanner details = new Scanner(System.in);
		System.out.println("Enter Your name ");
		System.out.println("your name is " + details.nextLine());
		System.out.println("Enter your age");
		byte age = details.nextByte();
		System.out.println("youre age is : " + age);
		System.out.println("Enter your number");
		int number = details.nextInt();
		System.out.println("Yoour number is : " + number);
		System.out.println("Enter yur salary");
		float salary = details.nextFloat();
		System.out.println("your salary is : " + salary);
		System.out.println("Enter your father name");
		String fatherName = details.next();
		System.out.println("Yoour father name is : " + fatherName);
		System.out.println("Are you mad");
		boolean s = details.nextBoolean();
		System.out.println("Yes i am man : " + s);
		details.close();
	}

}
