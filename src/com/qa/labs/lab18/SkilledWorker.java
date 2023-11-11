package com.qa.labs.lab18;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
	private ArrayList<String> skills = new ArrayList<>();
	
	public void addSkills(String skill) {
		skills.add(skill);
	}
	
	public SkilledWorker(String name, String jobTitle, ArrayList<String> skills) {
		super(name, jobTitle);
		this.skills = skills;
	}
	
	public SkilledWorker(String name, String jobTitle) {
		super(name, jobTitle);
		skills = new ArrayList<>();
	}
	
	public String getInfo() {
		String infoString = super.getInfo();
		infoString += "Skills: " + "\n";
		for (String skill : skills) {
			infoString += skill + "\n";
		}
		return infoString;
	}
	
}
