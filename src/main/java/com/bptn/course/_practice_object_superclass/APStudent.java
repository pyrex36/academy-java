package com.bptn.course._practice_object_superclass;

public class APStudent extends Student {
	private int apScore;

    public APStudent(String name, int age, int apScore) {
        super(name, age);
        this.apScore = apScore;
    }

    @Override
    public String toString() {
        return super.toString() + ", AP Score: " + apScore;
    }

//    public static void main(String[] args) {
//        APStudent apStudent = new APStudent("Alice", 17, 5);
//        System.out.println(apStudent);
//    }

}
