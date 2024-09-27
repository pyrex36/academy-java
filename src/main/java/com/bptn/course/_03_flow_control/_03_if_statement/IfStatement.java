package com.bptn.course._03_flow_control._03_if_statement;
import java.util.Scanner;

public class IfStatement {

	private static boolean s;

	public static void main(String[] args) {

/*		 Scanner scan = new Scanner(System.in);
	        System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
	        
	        String command = scan.nextLine();
	        int e = 0;
			int w = 0;
			int s = 0;
			if (command.equals("n")) {
	            System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
	        }
	        
	        // Add else-ifs for s, e, w, and an else for any other input. Be creative!
	        else if (e) {
	            System.out.println("You are now entering the beach shack!");
	        } else if (s) {
	            System.out.println("You are now at the sea!");
	        } else if (w) {
	            System.out.println("You are now headed west!");
	        } else {
	            System.out.println("End of adventure!");
	        }
	        
	        System.out.println("End of adventure!");   
	        scan.close();
	        */
		
		for(int i = 0; i < 10; i++) {
            if(i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("We've broken out of the loop!");
        
		
/*		for(int i = 0; i <= 6; i++) {
            if(i == 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("We've finished the loop!");
        */
	}
}
