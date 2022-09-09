package org.demo;

public class Array_Class {
	public static void main(String[] args) {
		int s[] = {2,3,4,7,29,20,10};
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		System.out.println(s[5]);
		System.out.println(s[6]);
		
		System.out.println(s.length);
		System.out.println(s.length - 1);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		for (int i : s) {
			System.out.println(i);
		}
	}
}
