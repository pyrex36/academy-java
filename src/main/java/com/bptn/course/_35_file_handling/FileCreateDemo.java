package com.bptn.course._35_file_handling;

import java.io.FileWriter;
import java.io.IOException;

class Student {
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	public int getStudentID() {
			return studentID;
		}
	public String getStudentName() {
		return studentName;
	}
}

public class FileCreateDemo {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("sample.txt");
			writer.write("This is a new file!");
			System.out.println("File created!");
			writer.close();
		} catch(IOException e) {
			System.out.println("Something went wrong while creating the file:");
			e.printStackTrace();
		}

	}

}
