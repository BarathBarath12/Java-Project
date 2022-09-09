package org.demo;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Barath");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		StringBuilder r = new StringBuilder("Barath");
		System.out.println(r);
		System.out.println(System.identityHashCode(r));
		StringBuilder e = new StringBuilder("kumar");
		System.out.println(e);
		System.out.println(System.identityHashCode(e));

		StringBuilder append = builder.append(r);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));

		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
	}
}
