package com.demo;

public class Reverse_String {
public static void main(String[] args) {
	String name = "Sony Show Room";
	String value ="";
	for (int i = name.length()-1; i >= 0; i--) {
		value = value + name.charAt(i);
	}
	System.out.println(value);
}
}
