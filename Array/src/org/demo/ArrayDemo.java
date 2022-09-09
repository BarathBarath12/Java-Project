package org.demo;

public class ArrayDemo {
	public static int a[] = new int[4];

	public static void main(String[] args) {
		a[0] = 2;
		a[1] = 4;
		a[3] = 10;
		a[3] = 20;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
	}

}
