package com.bptn.course._oop;

public class BankSystem {

	public static void main(String[] args) {
		
//		BankAccount myAccount = new BankAccount("983653", 1300.00);
//		myAccount.displayAccountInfo();
		
//		BankAccount newMyAccount = new BankAccount("231653", 1800.00);
//		newMyAccount.displayAccountInfo();

//		SavingsAccount myAccount = new SavingsAccount("SAVINGS123", 597.00, 3.00);
//		myAccount.applyInterest();
//		myAccount.displayAccountInfo();
		
		ChequingAccount myAccount = new ChequingAccount("1234", 500, 200);
		myAccount.withdraw(300);
		myAccount.displayAccountInfo();
	}

}
