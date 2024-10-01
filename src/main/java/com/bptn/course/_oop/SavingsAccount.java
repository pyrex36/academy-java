package com.bptn.course._oop;

class SavingsAccount extends BankAccount {
	
	private double interestRate;

	public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);
		this.interestRate = interestRate;
		
//		SavingsAccount mySavingsAccount = new SavingsAccount("578", 300.00);
		
	}
	
		public void applyInterest() {
			double interest = getBalance() * interestRate/100;
			deposit(interest);
		}
}


