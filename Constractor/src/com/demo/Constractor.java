package com.demo;

public class Constractor {
	public Constractor() {
		System.out.println("Parent Non Parameterized ");
	}

	public Constractor(int a) {
		System.out.println("Parameterized constractor value : " + a);
	}
	public Constractor(String name) {
		System.out.println("My name is : : " + name);
	}

}
