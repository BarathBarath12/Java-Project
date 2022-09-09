package org.demo;

import java.util.*;
import java.util.Map.Entry;

public class Linked_Hash_Map {
	public static void main(String[] args) {
		Map<Integer, String> s = new LinkedHashMap<Integer, String>();
		s.put(1, "Barath");
		s.put(2, "Kumar");
		s.put(3, "Arun");
		s.put(1, null);
		s.put(4, null);
		s.put(null, "Jaga");
		s.put(6, "Aneesh");
		s.put(null, "Joseph");
		System.out.println(s);
		int size = s.size();
		System.out.println("Size is : " + size);
		int index = size - 1;
		System.out.println("Index is : " + index);
		boolean key = s.containsKey(3);
		System.out.println("Key is present or not : " + key);
		boolean value = s.containsValue("Arun");
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
