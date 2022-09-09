package org.demo;

public class Constractors {
	public Constractors() {
		System.out.println("Non Parameterized");
	}

	public Constractors(int a) {
		System.out.println("Parameterized constractor value : " + a);
	}
	public Constractors(String name) {
		System.out.println("My name is : : " + name);
	}

	public static void main(String[] args) {
		
		new Constractors(12);
		new Constractors();
		new Constractors("Barath");
	}
}