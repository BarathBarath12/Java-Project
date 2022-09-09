package org.loop;

public class Increment_Decrement {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i--);  //10
		System.out.println(++i); // 10
		System.out.println(--i); //9
		System.out.println(i++); //9
		System.out.println(i++ + i ++);  //10 + 11=21
		System.out.println(--i); // 11
		System.out.println(--i + i--); //10+10=20
		System.out.println(--i); //8
		System.out.println(i++); //8
		System.out.println(--i + i++); // 8 + 8 = 16
		System.out.println(i); //9
	}

}
