package org.demo;
import java.util.Scanner;
public class Break {
	public static int startingPoint;
	public static int endingPoint;
	public static Scanner data = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter starting point");
		startingPoint= data.nextInt();
		System.out.println("Enter ending point");
		endingPoint = data.nextInt();
		for (int i = startingPoint; i <=endingPoint; i++) {
			if (i == 12 || i==21) {

				continue;
				
			} else {

				System.out.println(i);
			}
		}
	}
}
