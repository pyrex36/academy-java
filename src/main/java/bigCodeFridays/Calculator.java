package bigCodeFridays;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        // Will be used to keep displaying the menu until the user chooses to exit
        boolean active = true;
        while (active) {
            printMenu();
            Scanner scanner = new Scanner(System.in);

            // Checks which operation to use, calls the appropriate method
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    doAddition(scanner);
                    break;
                case 2:
                    doSubtraction(scanner);
                    break;
                case 3:
                    doMultiplication(scanner);
                    break;
                case 4:
                    doDivision(scanner);
                    break;
                case 5:
                    doSquare(scanner);
                    break;
                case 6:
                    doSquareRoot(scanner);
                    break;
                case 7:
                    doReciprocal(scanner);
                    break;
                default:
                    System.out.println(
                        "Invalid choice! Please make a valid choice."
                    );
            }

            // Asks the user if they want to continue using the calculator
            System.out.println(
                "To continue calculation Press 1, else press any other number to exit"
            );
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                default:
                    // By setting this to false, the loop condition will be false, and the loop will exit
                    active = false;
            }
        }
    }

    private static void doAddition(Scanner scanner) {
        int first = askForFirstNumber(scanner);
        int second = askForSecondNumber(scanner);
        double result = first + second;
        printResult(first, second, result, "addition");
    }

    private static void doSubtraction(Scanner scanner) {
        int first = askForFirstNumber(scanner);
        int second = askForSecondNumber(scanner);
        double result = first - second;
        printResult(first, second, result, "subtraction");
    }

    private static void doMultiplication(Scanner scanner) {
        int first = askForFirstNumber(scanner);
        int second = askForSecondNumber(scanner);
        double result = first * second;
        printResult(first, second, result, "multiplication");
    }

    private static void doDivision(Scanner scanner) {
        int first = askForFirstNumber(scanner);
        int second = askForSecondNumber(scanner);
        // need to cast to double, since dividing ints doesn't yield the correct answer, it rounds down to the nearest int result

        double result = ((double) first) / second;
        printResult(first, second, result, "division");
    }

    private static void doSquare(Scanner scanner) {
        int num = askForOneNumber(scanner, "Square");
        double result = num * num;
        printResult(num, result, "Square");
    }

    private static void doSquareRoot(Scanner scanner) {
        int num = askForOneNumber(scanner, "Square root");
        double result = Math.sqrt(num);
        printResult(num, result, "Square root");
    }

    private static void doReciprocal(Scanner scanner) {
        int num = askForOneNumber(scanner, "Reciprocal");
        // need to cast to double, since dividing ints doesn't yield the correct answer, 
        //it rounds down to the nearest int result
        double result = 1 / ((double) num);
        printResult(num, result, "Reciprocal");
    }

    private static void printResult(
        int num1,
        int num2,
        double result,
        String resultName
    ) {
        // Display the output message, need the result name since all the operations 
    	// have a different output depending on the name
        System.out.println(
            String.format(
                "The %s of the numbers %d and %d is = %f",
                resultName,
                num1,
                num2,
                result
            )
        );
    }

    private static void printResult(int num, double result, String resultName) {
        // prints the result for a single digit input
        System.out.println(
            String.format(
                "The %s of the number %d is = %f",
                resultName,
                num,
                result
            )
        );
    }

    private static int askForFirstNumber(Scanner scanner) {
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        return firstNumber;
    }

    private static int askForSecondNumber(Scanner scanner) {
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        return secondNumber;
    }

    private static int askForOneNumber(Scanner scanner, String name) {
        System.out.print(String.format("Enter the number to find %s: ", name));
        int number = scanner.nextInt();
        return number;
    }

    private static void printMenu() {
        System.out.println("/…Calculator Menu…/");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 to square a number");
        System.out.println("Press 6 to find a square root");
        System.out.println("Press 7 to find the reciprocal");
    }
}