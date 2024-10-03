package com.bptn.course._12_super_keyword;

public class OnlineCustomer {

	 private String email;

	    public OnlineCustomer(String n, String a, String e) {
	        super();
	        email = e;
	    }

	    
	    public String toString() {
	        return super.toString() + "\nEmail: " + email;
	    }

}