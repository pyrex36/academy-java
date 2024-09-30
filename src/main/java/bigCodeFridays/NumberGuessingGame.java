package bigCodeFridays;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int targetNumber = 0;
        int guess = 0;
        // Keep going while the guess isn't right
        do {
            // Get the targetNumber
            System.out.print("targetNumber: ");
            targetNumber = scanner.nextInt();
            // See if the target number is in a valid range
            if (targetNumber < 1 || targetNumber > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            System.out.print("guess: ");
            guess = scanner.nextInt();
            
            // Check to see if the guess is in bounds
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            // Check to see if the target number is high, low or just right
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
                break;
            }
        } while (targetNumber != guess);
          scanner.close();
    }
}

	
