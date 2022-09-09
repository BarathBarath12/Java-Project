package org.demo;

public class Memory {
	public static void main(String[] args) {
		String s = "Barath";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		String r = "Barath";
		System.out.println(r);
		System.out.println(System.identityHashCode(r));
		String e = "Arun";
		System.out.println(e);
		System.out.println(System.identityHashCode(e));

		String concat = s.concat(r);
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));
		System.out.println(s);
	}
}
