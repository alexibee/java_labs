package com.qa.labs.lab08;

public class Program {
	public static void main(String[] args) {
		Account account = new Account(1, "A Man With Some Money", 0);
	
		account.deposit(-10);
		account.deposit(3000);
		
		account.withdraw(20);
		account.withdraw(3000);
		
		account.getDetails();
		
		Account myAccount = new Account(2, "Me", 100);
		
		myAccount.addInterest();
		
		myAccount.getDetails();
		
		Account partnerAccount = myAccount;
		
		partnerAccount.addInterest();
		
		partnerAccount.getDetails();
		myAccount.getDetails();
		
		processAccount(myAccount);
		
		myAccount.getDetails();
		
		int k=100;
		
		incInt(k);
		
		System.out.println(k);
	}
	
	private static void incInt(int x) {
		x++;
	}

	
	static void processAccount(Account acc){ 
		acc.addInterest();
	}

	
}
