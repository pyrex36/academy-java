package com.bptn.course._28_search;

public class StudentSearch {
	 //Define the searchStudent method that takes an array of Student objects (students) and an integer rollNumber as parameters
    public static Student searchStudent(Student[] students, int rollNumber) {
        //Iterate through each Student object
        for(Student student : students) {
            // If the roll number of the current student matches the rollNumber parameter, 
            // then return the current student object
            if(student.getRollNumber()==rollNumber){
              return student;
            }
        }

        // If no student is found with the target roll number then return null

        return null;

    }
    public static void main(String[] args) {
        //Create an array of five students
        Student[] students = new Student[5];
        students[0] = new Student(101, "John");
        students[1] = new Student(102, "Alice");
        students[2] = new Student(103, "Bob");
        students[3] = new Student(104, "Emily");
        students[4] = new Student(105, "Mike");

 

       int targetRollNumber = 103;
       Student targetStudent = searchStudent(students, targetRollNumber);
        if (targetStudent!=null) {
            System.out.println("Student found:");
            System.out.println("Roll Number: " + targetStudent.getRollNumber());
            System.out.println("Name: " + targetStudent.getName());
        } else {
            System.out.println("Student not found!");
        }
    }
	
}
