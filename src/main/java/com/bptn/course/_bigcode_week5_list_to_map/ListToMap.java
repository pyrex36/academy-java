package com.bptn.course._bigcode_week5_list_to_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	    // Create static method "convertStudentListToMap"
	    public static Map<Integer, Student> convertStudentListToMap(List<Student> students) {
	        // Convert the list to a Stream
	        return students.stream()
	                       // Collect into a Map using toMap method
	                       .collect(Collectors.toMap(Student::getId, student -> student));
	    }

	    // Complete the main method
	    public static void main(String[] args) {
	        // Create a list of students
	        List<Student> students = new ArrayList<>();
	        
	        // Add student objects to this list
	        students.add(new Student(1, "Alice", 20));
	        students.add(new Student(2, "Bob", 22));
	        students.add(new Student(3, "Charlie", 21));
	        
	        // Call "convertStudentListToMap" method and hold the returned value in "studentMap" variable
	        Map<Integer, Student> studentMap = convertStudentListToMap(students);
	        
	        // Print the map
	        System.out.println("Students Map: " + studentMap);
	    }
}
