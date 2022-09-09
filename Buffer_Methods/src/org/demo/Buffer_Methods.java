package org.demo;

public class Buffer_Methods {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer("Barath");
	System.out.println("Append is : " + s.append(" Kumar"));
	System.out.println("Insert of : " + s.insert(0,"Sharmila "));
	System.out.println("Replace : " + s.replace(0, 8, "Sharami.la"));
	System.out.println("Delete is : " + s.delete(0, 7));
	System.out.println("Index of : " + s.indexOf("a", 7));
	System.out.println("last index of : " + s.lastIndexOf("a", 7));
}
}
