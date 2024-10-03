package com.bptn.course._12_super_keyword;

public class Student extends Person {

	 public Student(String name) {
	        super(name);
	    }

	    public String getFood() {
	        String output = super.getFood();
	        return output + " and Taco";
	    }
}
