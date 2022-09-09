package org.demo;

public class Factorial {
	public static int value = 1;

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			value = value * i;

		}
		System.out.println(value);
	}
}
