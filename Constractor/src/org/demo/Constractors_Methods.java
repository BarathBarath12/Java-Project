package org.demo;

public class Constractors_Methods {
	public Constractors_Methods() {
		System.out.println("Non Parameterized");
	}

	public Constractors_Methods(int a) {
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

		Constractors_Methods g = new Constractors_Methods(12);
		Constractors_Methods d = new Constractors_Methods();

		g.m1();
		g.m2();

	}
}
