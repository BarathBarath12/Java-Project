package org.demo;

public class Switch_Case {
public static String username = "Barath";
public static void main(String[] args) {
	System.out.println("Start");
	switch (username) {
	case "arun":
		System.out.println("value 2");
		break;
	case "Madan":
		System.out.println("value 3");
		break;
	case "Barath":
		System.out.println("Barath Sharmila");
	
	case "Sharmila":
		System.out.println("Sharmila Barath");
		
	default:
		break;
	}
	System.out.println("End");
}
}
