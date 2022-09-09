package org.demo;

public class A {
	public static int a = 10;

	private static void m1() throws Remainder_Alert{
		// TODO Auto-generated method stub
		if (a == 10) {
			System.out.println("Yes Barath");

		} else {
			throw new Remainder_Alert();
		}
		System.out.println("Welcome to Facebook");
	}

	public static void main(String[] args) throws Remainder_Alert {
		// TODO Auto-generated method stub
		m1();
	}

}
