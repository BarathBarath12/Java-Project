package com.demo;

public class Armstrong_Nmber {
public static void main(String[] args) {
	int a = 123;
	int number = a;
	int rem = 0;
	int value = 0;
	while (number>0) {
	rem = number%10;
	value = value + rem*rem*rem;
		number = number/10;
	}
	if (value==a) {
		System.out.println("its armstrong number");
	}
	else {
		System.out.println("its not armstrong number");
	}
}
}
