package com.bptn.course._23_thread_java;

public class MyThread1 extends Thread {

	 private int limitToStop;
	    // Parameterized constructor to initialize limitToStop
	    public MyThread(int limitToStop) {
	        this.limitToStop = limitToStop;
	    }
	    // Override the run() method
	    @Override
	    public void run() {
	        for (int i = 0; i <= limitToStop; i++) {
	            if (i % 2 != 0) { // Check if the number is odd
	                System.out.println("Odd number: " + i);
	                try {
	                    Thread.sleep(1000); // Pause for 1 second
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
}
