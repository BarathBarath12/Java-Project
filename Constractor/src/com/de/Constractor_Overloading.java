package com.de;

public class Constractor_Overloading {
	public Constractor_Overloading() {
		this("java");

	}

	public Constractor_Overloading(String b) {
		this(12);
		System.out.println(b);
	}

	public Constractor_Overloading(int a) {
		this('k');
		System.out.println(a);
	}

	public Constractor_Overloading(char c) {
		System.out.println(c);
	}

	public static void main(String[] args) {
		new Constractor_Overloading();
	}
}
