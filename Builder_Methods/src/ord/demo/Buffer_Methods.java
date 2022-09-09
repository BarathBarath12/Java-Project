package ord.demo;

public class Buffer_Methods {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Barath Loves");
		System.out.println("Apeend is : " + builder.append(" Sharmila"));
		System.out.println("Insert of : " + builder.insert(12, " Kutton"));
		System.out.println("Replace is : " + builder.replace(7, 12, "L.o.v.e.s."));
		System.out.println("Delete is : " + builder.delete(15, 17));
		System.out.println("Index of s : " + builder.indexOf("e", 10));
		System.out.println("Last index of : " + builder.lastIndexOf("a", 25));
		System.out.println("Reverse of : " + builder.reverse());

	}
}
