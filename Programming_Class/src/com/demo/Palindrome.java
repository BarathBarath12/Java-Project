package com.demo;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "keek";
String empty = "";
for (int i = name.length()-1; i>=0 ; i--) {
	empty = empty + name.charAt(i);
	
}
if (empty.equals(name)) {
	System.out.println("Its palindrome");
}
else {
	System.out.println("its not palindrome");
}
	}

}
