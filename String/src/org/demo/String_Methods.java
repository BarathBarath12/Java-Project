package org.demo;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to Barath Home";
		int length = s.length();
		System.out.println("Length is : " + length);
		int index = length - 1;
		System.out.println("Index is : " + index);
		boolean equal = s.equals("welcome to barath Home");
		System.out.println("Equal is : " + equal);
		Boolean equalsIgnore = s.equalsIgnoreCase("welcome to barath home");
		System.out.println("Equals ingnore case : " + equalsIgnore);
		String upperCase = s.toUpperCase();
		System.out.println("Uppper case is : " + upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println("Lower case is : " + lowerCase);
		char c = s.charAt(11);
		System.out.println("Char of index 11 is : " + c);
		int f = s.indexOf("e");
		System.out.println("Index of : " + f);
		int firstIndex = s.indexOf("t");
		System.out.println("Fist index of : " + firstIndex);
		int lastIndex = s.lastIndexOf("o");
		System.out.println("Last index of is : " + lastIndex);
		boolean k = s.contains("W");
		System.out.println("Char is present or not : " + k);
		boolean startWith = s.startsWith("Wel");
		System.out.println("Prefix string present or not : " + startWith);
		boolean endwith = s.endsWith("Barath Home");
		System.out.println("Sufix string present or not : " + endwith);
		String name = "    Barath kumar     ";
		String trim = name.trim();
		System.out.println("Trim is : " + trim);
		String replace = s.replace("o", "$");
		System.out.println("Replace char is : " + replace);
		String add = s.concat(" World");
		System.out.println("Concat is : " + add);
		String beginIndex = s.substring(11);
		System.out.println("Sub String is : " + beginIndex);
		String endindex = s.substring(3, 14);
		System.out.println("Start and end index is : " + endindex);
		String e = String.join(" ", "13", "11", "1998");
		System.out.println("elements is : " + e);
		String firstName = "null";
		boolean q = firstName.isEmpty();
		System.out.println("Empty Char is present or not : " + q);

	}

}
