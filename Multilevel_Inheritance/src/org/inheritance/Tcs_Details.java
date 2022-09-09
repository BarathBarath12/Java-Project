package org.inheritance;

public class Tcs_Details extends Cpg_Details {
	public void cmp_name() {
		System.out.println("Tcs");
	}

	public static void main(String[] args) {
		Tcs_Details data = new Tcs_Details();
		data.office_Info();
		data.officename();
		data.office_name();
		data.position();
		data.Coz_office_name();
		data.cmp_name();
	}
}
