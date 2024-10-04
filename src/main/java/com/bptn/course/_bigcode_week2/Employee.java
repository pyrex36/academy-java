package com.bptn.course._bigcode_week2;

public class Employee {
	
	 // Private instance variables
    private int salary;
    private int hoursPerDay;

    // Constructor to initialize salary and hoursPerDay
    public Employee(int salary, int hoursPerDay) {
        setSalary(salary);
        setHoursPerDay(hoursPerDay);
    }

    // Method to set the salary with the specified conditions
    public void setSalary(int salary) {
        if (salary < 500) {
            this.salary = salary + 10;
        } else {
            this.salary = salary;
        }
    }

    // Method to set the hours per day and adjust salary if necessary
    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
        if (hoursPerDay > 6) {
            this.salary += 5;
        }
    }

    // Method to get the salary
    public int getSalary() {
        return this.salary;
    }

}
