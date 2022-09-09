package org.project;

import org.client.Client;

public class Project extends Client {
	protected void project_Name() {
		// TODO Auto-generated method stub
		System.out.println("Apollo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project data = new Project();
		data.client_Name();
		data.company_Name();
		data.emp_Name();
		data.project_Name();
	}
}
