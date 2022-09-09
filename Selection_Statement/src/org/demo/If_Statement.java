package org.demo;

import java.util.Scanner;

public class If_Statement {
	public static String username;
	public static String password;
	public static int age;
	public static String email = "barathsmart992@gamail.com";
	public static String gender = "Male";
	public static String forgotUsername;
	public static Scanner data = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter your Username and password");
		username = data.next();
		password = data.next();
		if (username.equals("barath") && password.equals("Barath@998")) {
			System.out.println("Welcome to you tube");

		}
		


		else {
			System.out.println("Invalid passoword");
		}

	}

}
