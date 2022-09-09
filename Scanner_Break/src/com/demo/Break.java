package com.demo;
import java.util.Scanner;
public class Break {
public static int startingNumber, endingNumber,value,base;
public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		System.out.println("Enter the starting number");
		startingNumber=s.nextInt();
		System.out.println("Enter the ending number");
		endingNumber = s.nextInt();
		System.out.println("Enter Skip value 1");
		value = s.nextInt();
		for (int i = startingNumber; i <= endingNumber; i++) {
			
			if (i==value) {
				break;

			}
			
			else {
				System.out.println(i);
			}
		}
		System.out.println("End");
	}
}