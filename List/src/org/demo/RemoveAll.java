package org.demo;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> s = new ArrayList<Object>();
		s.add(1);
		s.add(3);
		s.add(24);
		s.add(78);
		List<Object> b = new ArrayList<Object>();
		b.add(3);
		b.add(1);
		b.add(null);
		b.add(9);
		s.removeAll(b);
		System.out.println(s);
}
}
