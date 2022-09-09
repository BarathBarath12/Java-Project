package com.demo;

public class Reverse_Number {
public static void main(String[] args) {
	int a = 123;
	int number = a;
	int rem = 0;
	int value = 0;
	while (number>0) {
	rem = number%10;
	value = (value*10) + rem;
		number = number/10;
	}
	System.out.println(value);
}
}