package org.overloading;

public class Staff_Details {
	private void staffinfo() {
		// TODO Auto-generated method stub
		System.out.println("Staff Information");
	}

	private void staffinfo(String name) {
		System.out.println("Staff name is : " + name);
	}

	private void staffinfo(int staff_Id) {
		System.out.println("ID is : " + staff_Id);
	}

	private void staffinfo(float salary) {
		System.out.println("Salary is :" + salary);
	}

	private void staffinfo(long account_Number) {
		System.out.println("Acc number is : " + account_Number);
	}

	public static void main(String[] args) {
		Staff_Details data = new Staff_Details();
		data.staffinfo();
		data.staffinfo("barath");
		data.staffinfo(1288221);
		data.staffinfo(12000.90f);
		data.staffinfo(709288281021l);

	}
}
