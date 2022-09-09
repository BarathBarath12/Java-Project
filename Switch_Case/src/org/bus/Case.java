package org.bus;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Barath";
		int b = 20;
		switch (name) {
		case "barath":
			System.out.println("Value is 2");

		case "Barath":
			System.out.println("Value is 3");

		case "djjd":
			System.out.println("Value is 10");
			
		case "jdjd":
			System.out.println("value is 4");
			
		default:
			break;
		}
		switch (b) {
		case 3:
			System.out.println("value is 3");
			break;
		case 8:
			System.out.println("value is 8");
			break;
		case 20:
			System.out.println("value is 20");
			break;
		default:
			break;
		}
	}

}
