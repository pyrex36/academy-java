package com.bptn.course._25_synchronization;
	
	public class TestSynchronization {  

	    public static void main(String args[]) { 

	        Table table = new Table(); //only one instance  
	        
	        MyThread t1 = new MyThread(5,table);  
	        MyThread t2 = new MyThread(100,table);  
	        
	        t1.start();  
	        t2.start();  
	    }   
}
