package org.demo;

import java.util.*;
import java.util.Map.Entry;

public class Hash_Table {
	public static void main(String[] args) {
		Map<Integer, String> s = new Hashtable<Integer, String>();
		s.put(1, "Barath");
		s.put(2, "Kumar");
		s.put(3, "Arun");
		s.put(1, "iki");
		s.put(4, "peter");
		s.put(8, "Jaga");
		s.put(7, "Aneesh");
		s.put(12, "Joseph");
		System.out.println(s);
		int size = s.size();
		System.out.println("Size is : " + size);
		int index = size - 1;
		System.out.println("Index is : " + index);
		boolean key = s.containsKey(3);
		System.out.println("Key is present or not : " + key);
		boolean value = s.containsValue("Barath");
		System.out.println("Value is present or not : " + value);
		boolean empty = s.isEmpty();
		System.out.println("Map is Empty or not : " + empty);
		Set<Integer> keySet = s.keySet();
		System.out.println("All key is : " + keySet);
		Collection<String> r = s.values();
		System.out.println("All value is : " + r);
		Set<Entry<Integer, String>> g = s.entrySet();
		System.out.println("All entry key and value is : " + g);
		s.clear();
		System.out.println("Clear is : " + s);

	}
}
