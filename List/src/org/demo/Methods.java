package org.demo;

import java.util.ArrayList;
import java.util.List;

public class Methods {
	public static void main(String[] args) {

		List<Object> s = new ArrayList<Object>();
		s.add(1);
		s.add(3);
		s.add(24);
		s.add(78);
		s.add(21);
		s.add(1);
		s.add(null);
		s.add(3);
		s.add(null);
		s.add(2, "Barath");
		System.out.println(s);
		System.out.println("Size is : " + s.size());
		int b = s.size()-1;
		System.out.println("Index is : " + b);
		System.out.println(s.indexOf(3));
		System.out.println(s.lastIndexOf(null));
		boolean c = s.contains(24);
		System.out.println(c);
		Object d = s.get(2);
		System.out.println(d);
		s.set(3, "Kumar");
		System.out.println(s);
		System.out.println(s.isEmpty());
		
		s.clear();
		System.out.println(s);
	}
}
