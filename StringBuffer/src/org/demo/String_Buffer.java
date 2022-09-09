package org.demo;

public class String_Buffer {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Barath");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		StringBuffer r = new StringBuffer("Barath");
		System.out.println(r);
		System.out.println(System.identityHashCode(r));
		StringBuffer e = new StringBuffer("kumar");
		System.out.println(e);
		System.out.println(System.identityHashCode(e));

		StringBuffer append = buffer.append(r);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));

		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
	}
}
