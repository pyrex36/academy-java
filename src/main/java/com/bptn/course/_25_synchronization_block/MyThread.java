package com.bptn.course._25_synchronization_block;

	public class MyThread extends Thread {
	    
	    SynchronizedPrinter printer = new SynchronizedPrinter();

	    // Create a constructor to initialize the printer instance variable.
	    public MyThread(SynchronizedPrinter printer) {
	        this.printer = printer;
	    }

	    // Override the run() method to call printNumbers() method of the printer instance variable.
	    @Override
	    public void run() {
	        printer.printNumbers();
	    }
}
