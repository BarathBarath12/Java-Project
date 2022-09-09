package org.key;

public final class Key_word {
	public int b = 12;
	public static int j = 10;
	public final int c = 12;

	public static void student_details() {
		int a = 10;
		System.out.println(a);

	}

	public final void m1() {

		j = 90;
		System.out.println(c);
		System.out.println(j);
		System.out.println(b);
	}

	public void m3() {
		j = 70;
		b = 40;
		System.out.println(b);
		System.out.println(j);
	}

	public static void m4() {
		System.out.println(j);
	}

	public static void main(String[] args) {
		Key_word data = new Key_word();
		m4();
		data.m3();
		data.m1();
		student_details();

	}

}
