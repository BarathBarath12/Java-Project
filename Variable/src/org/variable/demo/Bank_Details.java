package org.variable.demo;

import org.variable.Emp_Details;

public class Bank_Details extends Emp_Details {
	public int value;
	public static int code;
	public final int f = 4900;

	private static void bankName() {
		String name = "Canera Bank";
		System.out.println(name);
	}

	public final void m8() {
		int nj = 20;
		System.out.println(nj);
		System.out.println(this.code);
		System.out.println(super.b);
	
	}

	private static String m9() {
		// TODO Auto-generated method stub
		String fatherName = "Kumar";
		return fatherName;
	}

	public static void main(String[] args) {
		Bank_Details details = new Bank_Details();
		System.out.println(details.f);
		System.out.println(details.value);
		System.out.println(details.a);
		int g = details.c;
		System.out.println(g);
		System.out.println(details.m3());
		m1();
		details.m4();
		bankName();
		System.out.println(m9());
		details.m8();

	}

}
