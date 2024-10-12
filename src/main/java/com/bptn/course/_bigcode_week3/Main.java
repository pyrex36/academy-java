package com.bptn.course._bigcode_week3;

public class Main {

    private int instanceVar = 5;

    public void instanceMethod() {
        System.out.println("Instance method. Instance variable: " + instanceVar);
    }

    public static void staticMethod() {
        System.out.println("Static method.");
        // System.out.println(instanceVar); // This would cause an error
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.instanceMethod(); // Works

        Main.staticMethod(); // Also works
    }
}
