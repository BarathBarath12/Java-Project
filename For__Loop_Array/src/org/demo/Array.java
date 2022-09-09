package org.demo;

public class Array {
	public static int a[] = new int[4];

	public static void main(String[] args) {
		a[0] = 2;
		a[1] = 3;
		a[3] = 4;
		System.out.println(a.length-1);
		for (int i = 0; i< a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
