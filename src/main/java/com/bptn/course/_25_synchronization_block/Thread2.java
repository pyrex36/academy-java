package com.bptn.course._25_synchronization_block;

	public class Thread2 extends Thread {
	    
	    SynchronizedPrinter obj;
	    
	    // Create a constructor to initialize the above instance variable
	    public Thread2 (SynchronizedPrinter obj) {
	    	this.obj = obj;
	    }
	    
	    // Override the run() method here to call printNumbers()
	    @Override
	    public void run() {
	    	obj.printNumbers();
	    }
}
