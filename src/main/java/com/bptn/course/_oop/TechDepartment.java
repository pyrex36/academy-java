package com.bptn.course._oop;

 class TechDepartment extends Department {
	 
	 private double totalPurchaseAmount;

	public TechDepartment(String nameDepartment, int employeeAmount, double totalPurchase, double totalPurchaseAmount) {
		super(nameDepartment, employeeAmount);
		this.totalPurchaseAmount = totalPurchaseAmount;
	}
	
	
}
