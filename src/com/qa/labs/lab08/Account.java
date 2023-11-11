package com.qa.labs.lab08;

public class Account {
	private int id;
	private String owner;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount < 0) {
			System.out.println("Cannot deposit a negative amount");
		} else {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Cannot withdraw amount which is over budget");
		} else {
			balance -= amount;
		}
	}
	
	public void getDetails() {
		System.out.println("Details: id: " + this.id + " owner: " + this.owner + " balance: " + this.balance);
	}
	
	public void addInterest() {
		balance = balance*1.025;
	}
}
