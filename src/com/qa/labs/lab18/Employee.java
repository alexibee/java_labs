package com.qa.labs.lab18;

public class Employee {
	private String name;
	private String jobTitle;
	private int id;
	protected static int idCount;
	public String getName() {  return name; }
	private void setName(String name) { this.name = name; }
	public String getJobTitle() { return jobTitle; }
	private void setJobTitle(String jobTitle) { this.jobTitle = jobTitle;}
	private void setId(int id) { this.id = id; }
	public int getId() { return id;	}
	public Employee(String name, String jobTitle ) {
				      setId(++Employee.idCount * 10);
		      setName(name);
		      	setJobTitle(jobTitle);		
	}
	public String getInfo() {
      String info = "\n**** *****";
      info += "Name: " + getName() + "\n";
      info += "Job Title: "+ getJobTitle() + "\n";
      info += "Employee ID: "+ getId()+ "\n";
      return info;		
	}
}
