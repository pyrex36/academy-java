package com.bptn.course._25_synchronization;

	public class MyThread extends Thread {  

	    int i;
	    Table t;  

	    MyThread(int i, Table t) {
	        this.i=i;  
	        this.t=t;  
	    }  
	    
	    public void run() {  
	        t.printTable(this.i);  
	    }  

}
