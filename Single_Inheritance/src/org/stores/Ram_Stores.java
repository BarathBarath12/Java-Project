package org.stores;
public class Ram_Stores extends Raj_Stores {
	public void product() {
		// TODO Auto-generated method stub
System.out.println("product is Shamp,rice,oil...etc");
	}
	public void workers() {
		System.out.println("20");
	}
public void position() {
	System.out.println("1");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ram_Stores data = new Ram_Stores();
		data.store_Review();
		data.workers();
		data.store_address();
	}
}
