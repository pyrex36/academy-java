package com.bptn.course._23_thread;
	
import java.util.List;

public class MyThread extends Thread {
    private List<Integer> list;
    public MyThread(String name, List<Integer> list){

        super(name);

        this.list = list;
    }
    // Create a constructor to initialize the above instance variable

    // public MyThread(SynchronizedPrinter printer) {

    //     this.printer = printer;

    // }
    // Override the run() method to call the printNumbers() methods.

    @Override

    public void run(){
        // this.printer.printNumbers();
        ListUtils.insertNextId(list);

    }


}
