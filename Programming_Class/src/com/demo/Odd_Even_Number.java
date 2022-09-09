package com.demo;

public class Odd_Even_Number {

	public static void main(String[] args) {
//		int i = 10;
//		if (i%2==0) {
//			System.out.println("Even number");
//		}
//		else {
//			System.out.println("Odd number");
//		}
//		for (int i = 1; i <=10; i++) {
//			if (i%2==0) {
//				System.out.println("Even number : " + i);
//			}
//			else {
//				System.out.println("Odd number : " + i);
//			}
//		}
		int oddNumber = 0, evenNumber = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenNumber = evenNumber + i;
			} else {
				oddNumber = oddNumber + i;
			}
			
		}
		System.out.println("Total odd number is : " + oddNumber);
		System.out.println("Total even numbr is : " + evenNumber);
	}

}
