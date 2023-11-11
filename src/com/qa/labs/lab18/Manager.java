package com.qa.labs.lab18;
import java.util.ArrayList;

public class Manager extends Employee {
	private ArrayList<Employee> employees;
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	
	@Override
	public String getInfo() {
		String infoString = super.getInfo();
		for (Employee emp : employees) {
			String empString = emp.getInfo();
			infoString += empString;
		}
		return infoString;

	}
	
	public Manager(	String name, String jobTitle, ArrayList<Employee>employees) {
		super(name, jobTitle);
		this.employees = employees;
	}
	
	public Manager(String name, String jobTitle) {
		super(name, jobTitle);
		employees = new ArrayList<>();
	}
	
}
