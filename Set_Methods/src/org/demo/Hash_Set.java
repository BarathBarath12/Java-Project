package org.demo;

import java.util.*;

public class Hash_Set {
	public static void main(String[] args) {

		Set<Object> s = new HashSet<Object>();
		s.add(1);
		s.add(1);
		s.add(null);
		s.add(23);
		s.add(32);
		s.add(null);
		s.add(8);
		System.out.println(s);
		System.out.println("For each is below");
		for (Object object : s) {

		}
		System.out.println(s);
		System.out.println("size is : " + s.size());

		boolean contains = s.contains(43);
		System.out.println("Element is present or not : " + contains);

		boolean empty = s.isEmpty();
		System.out.println("List is empty or not : " + empty);

		s.clear();
		System.out.println("Clear the all list : " + s);
		Set<Object> a = new HashSet<Object>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		Set<Object> b = new HashSet<Object>();
		b.add(1);
		b.add(2);
		b.add(8);
		b.add(10);
		// a.addAll(b);
		// System.out.println("Add of two list is : " + a);
		// a.retainAll(b);
		// System.out.println("Fetch all Common values is : " + a);
		a.removeAll(b);
		System.out.println("Remove all common values is : " + a);
		a.clear();
		System.out.println("Clear all elements is : " + a);

	}
}