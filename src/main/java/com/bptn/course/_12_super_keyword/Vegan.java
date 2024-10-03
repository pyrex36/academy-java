package com.bptn.course._12_super_keyword;

public class Vegan extends Person {
	
	  public Vegan(String name){
	        super(name);
	    }

	    public String getFood() {
	        return "No " + super.getFood();
	    }
	    

}
