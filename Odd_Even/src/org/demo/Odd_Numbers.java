package org.demo;

public class Odd_Numbers {
	public static int evenNumber, oddNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenNumber = evenNumber + i;

			} else if (i % 2 != 0) {
				oddNumber = oddNumber + i;
			}
		}

		System.out.println("Even number is : " + evenNumber);

		System.out.println("Odd number is : " + oddNumber);
	}

}
