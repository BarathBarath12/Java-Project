package org.demo;

public class Try_Catch {
	public static void main(String[] args) {
		int a = 10;
		try {
			System.out.println(a / 0);

		} catch (Exception e) {
			// TODO Auto-generated catch block
		

			System.out.println("Arithmetic Exception");

		}
	}
}