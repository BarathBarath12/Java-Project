package org.demo;

public class A {
	public static int a = 10;

	private static void m1() throws ArithmeticException,NullPointerException {
		// TODO Auto-generated method stub
		if (a == 11) {
			System.out.println("Yes Barath");

		} else {
			throw new NullPointerException();
		}
		System.out.println("Welcome to Facebook");
	}

	public static void main(String[] args) throws ArithmeticException,NullPointerException {
		// TODO Auto-generated method stub
		m1();
	}

}
