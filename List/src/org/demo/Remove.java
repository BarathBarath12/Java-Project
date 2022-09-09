package org.demo;

import java.util.ArrayList;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> s = new ArrayList<Object>();
		s.add(1);
		s.add(3);
		s.add(24);
		s.add(78);
		System.out.println(s);
		s.remove(2);
		System.out.println(s);
		
}

}