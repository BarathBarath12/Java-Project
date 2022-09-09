package com.demo;

public class Constractor_Methods extends Constractor {

	public Constractor_Methods() {
		System.out.println("Child Non Parameterized");
	}

	public Constractor_Methods(int a) {
		super("Barath");
		System.out.println("Parameterized constractor value : " + a);
	}

	private void m1() {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("M1 value is : " + a);
	}

	private void m2() {
		// TODO Auto-generated method stub
		int a = 20;
		System.out.println("M2 value is : " + a);
	}

	public static void main(String[] args) {

		Constractor_Methods g = new Constractor_Methods(12);
		Constractor_Methods d = new Constractor_Methods();
		g.m1();
		g.m2();

	}
}
