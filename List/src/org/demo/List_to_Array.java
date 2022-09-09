package org.demo;

import java.util.ArrayList;
import java.util.List;

public class List_to_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			List<Object> s = new ArrayList<Object>();
			s.add(1);
			s.add(3);
			s.add(24);
			s.add(78);
			System.out.println(s);
			Object[] a = s.toArray();
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			System.out.println("After for loop");
			for (int i = 0; i <= 3; i++) {
				System.out.println(a[i]);
				
			}
			System.out.println("After each loop");
			 for  (Object b : a) {
				 System.out.println(b);
				
			}
			
	}

}
