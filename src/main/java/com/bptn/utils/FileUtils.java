package com.bptn.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner; 

public class FileUtils {
	 public static void main(String[] args) {
	        // The main() method is implemented in part 2 of this exercise.
	        FileUtils fileUtils = new FileUtils();
	        
	        String DIRECTORY_PATH = System.getProperty("user.dir") + "/test.txt";
	        
	        String filePath = DIRECTORY_PATH + "test.txt";
	        
	        System.out.println(filePath);
	        
	        fileUtils.writeFile(Paths.get(filePath));
	        fileUtils.updateFile(Paths.get(filePath));
	        fileUtils.readFile(Paths.get(filePath));
	        fileUtils.deleteFile(Paths.get(filePath));
	    }
		// Method to check if a file exists and return true or false
	    public static boolean isFileExist(Path path) {
	        if (Files.exists(path)) {
	            System.out.println("File exists!");
	            return true;
	        } else {
	            System.out.println("File doesn't exist!");
	            return false;
	        }
	    }

	    // Method to check if a file exists with exception handling
	    public static boolean isFileExistsWithExceptionHandling(Path path) {
	        try {
	            new Scanner(new File(path.toString()));  // Attempt to open file
	            System.out.println("File exists");
	            return true;
	        } catch (FileNotFoundException e) {
	            System.out.println("File doesn't exist!");
	            return false;
	        }
	    }

	    // Method to create the file if it doesn’t exist
	    public static boolean createFileIfNotExist(Path path) {
	        if (Files.exists(path)) {
	            System.out.println("File already exists.");
	            return true;
	        } else {
	            try {
	                Files.createFile(path);
	                System.out.println("File created successfully.");
	                return true;
	            } catch (IOException e) {
	                System.out.println("An error occurred while creating the file.");
	                return false;
	            }
	        }
	    }
	    public void readFile(Path path) {
	        if (isFileExist(path)) {
	            try (Scanner scanner = new Scanner(path)) {
	                System.out.println("Reading file contents:");
	                while (scanner.hasNextLine()) {
	                    System.out.println(scanner.nextLine());
	                }
	            } catch (IOException e) {
	                System.out.println("An error occurred while reading the file.");
	            }
	        }
	    }
	    public void deleteFile(Path path) {
	        if (isFileExist(path)) {
	            try {
	                Files.delete(path);
	                System.out.println("File deleted successfully.");
	            } catch (IOException e) {
	                System.out.println("An error occurred while deleting the file.");
	            }
	        }
	    }
	    public void writeFile(Path path) {
	        if (createFileIfNotExist(path)) {
	            try (FileWriter writer = new FileWriter(path.toString())) {
	                writer.write("This is the initial content of the file.\n");
	                writer.close();
	                System.out.println("Content written to file successfully.");
	            } catch (IOException e) {
	                System.out.println("An error occurred while writing to the file.");
	            }
	        }
	    }
	    public void updateFile(Path path) {
	        if (isFileExist(path)) {
	            try (FileWriter writer = new FileWriter(path.toString(), true)) {
	                writer.write("This is an update to the file.\n");
	                System.out.println("Content updated in file successfully.");
	            } catch (IOException e) {
	                System.out.println("An error occurred while updating the file.");
	            }
	        }
	    }
}
