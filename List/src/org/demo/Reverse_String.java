package org.demo;

public class Reverse_String {
	public static void main(String[] args) {

		String name = "keek";
		String empty = "";
		int i = name.length() - 1;
		while (i >= 0) {
			empty = empty + name.charAt(i);
			i--;
		}
		System.out.println(empty);
		if (name.equals(empty)) {
			System.out.println("Is a palindrome");

		} else {
			System.out.println("Is not palindrome");
		}

	}
}
