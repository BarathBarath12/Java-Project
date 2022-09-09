package org.demo;

public class Try_Catch_Finally {
	public static void main(String[] args) {
		int i = 10;
		try {
			System.out.println(i/0);

		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Null point");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Arith methic Except");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception");
		} finally {
			System.out.println("Finally");
		}
	}

}