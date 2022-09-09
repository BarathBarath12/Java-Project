package org.nestedloop;

public class Nested_Loop {

	public static void main(String[] args) {

		System.out.println("Start");
		for (int i = 3; i >= 1; i--) {
			for (int j = 99; j <=  97; j++) {
				System.out.println(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("End");
	}

}
