package com.demo;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to palace";
		System.out.println("Length is : " + s.length());
		System.out.println(s.length() - 1);
		System.out.println("String is Equal or not : " + s.equals("welcome to palace"));
		System.out.println("Equals ignor or not : " + s.equalsIgnoreCase("welcome to palace"));
		System.out.println("Uppper case is : " + s.toUpperCase());
		System.out.println("Lower case is : " + s.toLowerCase());
		System.out.println("Char at index 6 is : " + s.charAt(6));
		System.out.println("Index of second occurance is : " + s.indexOf("e", 2));
		System.out.println("Last indext of second occurance : " + s.lastIndexOf("a", 13));
		System.out.println("M  is present or not : " + s.contains("m"));
		System.out.println("Start word is present or not : " + s.startsWith("We"));
		System.out.println("End word is presentt or not : " + s.endsWith("palace"));
		String r = "     arun house     ";
		System.out.println("Trim is : " + r.trim());
		System.out.println("Replace of string is : " + s.replace("e", "#"));
		String name = "X#rox# ethan# place$";
		String v = name.replaceAll("[^a-zA-Z]", " ");
		System.out.println("Replace all is : " + v);
		System.out.println("trim is : " + v.trim());
		System.out.println("Concat is : " + s.concat(" Gova"));
		System.out.println("Substring is : " + s.substring(8));
		System.out.println("End Substring is : " + s.substring(0, 7));
		System.out.println("Join of DOB is : " + s.join("-", "13", "11", "1998"));
		String empty = "";
		System.out.println("String is empty or not : " + empty.isEmpty());
		String city = "Beatiful chennai City";
		String[] split = city.split(" ");
		System.out.println("city of length is : " + city.length());
		System.out.println(city.length() - 1);
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		for (String i : split) {
			System.out.println(i);

		}

	}

}
