package com.bptn.course._14_array_list;

import java.util.*;


public class Main1 {

	    public static void main(String[] args) {

	        List<Student> studentList = new ArrayList<>();

	        studentList.add(new Student("Student1", 80));
	        studentList.add(new Student("Student2", 75));
	        studentList.add(new Student("Student3", 86));
	        studentList.add(new Student("Student4", 74));
	        studentList.add(new Student("Student5", 92));
	        studentList.add(new Student("Student6", 72));
	        studentList.add(new Student("Student7", 60));

	        // initialize passList
	        List<Student> passList = new ArrayList<>();

	        // Loop through studentlist to filter the students with target grade
	        for (Student student : studentList) {
	             if (student.getClassGrade() >= 75) {
	                passList.add(student);
	            }
	        }

	        // print out the students using a for-each loop.   
	        for (Student student : passList) {
	            System.out.println("Student name is: " + student.getName() + 
	            		" and student's class grade is: Grade " + student.getClassGrade());
	        }   
	    }
}
