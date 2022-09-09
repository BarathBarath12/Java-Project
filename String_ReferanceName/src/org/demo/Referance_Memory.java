package org.demo;

public class Referance_Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "Barath";
System.out.println(name);
System.out.println(System.identityHashCode(name));
String name1 = "Barath";
System.out.println(name1);
System.out.println(System.identityHashCode(name1));
String name2 = "Barath";
System.out.println(name2);
System.out.println(System.identityHashCode(name2));
name =name+name1;
System.out.println(name); 
System.out.println(System.identityHashCode(name));


	}


}
