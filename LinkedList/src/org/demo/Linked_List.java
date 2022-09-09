package org.demo;

import java.util.*;

public class Linked_List {

	public static void main(String[] args) {
		List<Object> s = new LinkedList<Object>();
		s.add(1);
		s.add(1);
		s.add(null);
		s.add(23);
		s.add(32);
		s.add(null);
		s.add(2, "barath");
		s.add(8);
		s.add(2, 23);

		System.out.println(s);
		System.out.println("Covert list to array");
		Object[] c = s.toArray();
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println("For loop is below");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("For each loop is below");
		for (Object object : c) {
			System.out.println(object);

		}
		System.out.println("Covert list to string");
		String d = s.toString();
		System.out.println(d);
		int size = s.size();
		System.out.println("Size is : " + size);
		int index = size - 1;
		System.out.println("Index is : " + index);
		int indexof = s.indexOf(23);
		System.out.println("Index of first occurance is : " + indexof);
		int lastIndexOF = s.lastIndexOf(null);
		System.out.println("Last index of first occurance is : " + lastIndexOF);
		boolean contains = s.contains("barath");
		System.out.println("Element is present or not : " + contains);
		Object get = s.get(4);
		System.out.println("Retrun the particualr element is : " + get);
		s.set(1, 100);
		System.out.println("Replace the value is : " + s);
		boolean empty = s.isEmpty();
		System.out.println("List is empty or not : " + empty);
		s.remove(3);
		System.out.println("Remove the index 3 : " + s);
		s.clear();
		System.out.println("Clear the all list : " + s);
		List<Object> a = new LinkedList<Object>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		List<Object> b = new LinkedList<Object>();
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
