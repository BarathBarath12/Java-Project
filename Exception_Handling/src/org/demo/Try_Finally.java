package org.demo;

public class Try_Finally {
	public static void main(String[] args) {
		int i = 10;
		try {

			System.out.println(i);

		} finally {
			System.exit(0);
			System.out.println("Finally is there");
		}
	}
}
