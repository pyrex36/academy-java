package com.bptn.course._oop;

 class SalesDepartment extends Department {
	 
	 private double totalSalesAmount;
	
	public SalesDepartment(String nameDepartment, int employeeAmount, double totalSalesAmount) {
		super(nameDepartment, employeeAmount);
		this.totalSalesAmount = totalSalesAmount;
		
	}

	
	
	
}
