
/**
 * This program introduces Java methods including how to use parameters
 * and return a variable.
 *
 * @author Ms. Schulze
 * @version (1.1)
 */

import java.util.Scanner;

public class Methods
{
    static void clearScreen() {
        System.out.print('\u000C');
    }
    
    static void printHelloJava() {
        System.out.println("Hello, Java Students!  Methods are awesome!");
    }
    
    static void personalHello(String name) {
        System.out.println("Hello, " + name + ". Isn't Java fantastic!");
    }
    
    static boolean playAgain() {
        Scanner key = new Scanner(System.in);

        boolean runAgain = key.nextBoolean();
        
        return runAgain;
    }
    
    static double inputNumber(String numLabel) {
        Scanner key = new Scanner(System.in);
        double newDouble;
        
        System.out.print("Input the " + numLabel + " number:  ");
        newDouble = key.nextDouble();
        
        return newDouble;
    }
    
    static double addTwoNumbers(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Define variables
        boolean runAgain;
        Scanner keyboard = new Scanner(System.in);
        String userName;
        
        double number1;
        double number2;
        double answer;
        
        // Do-While Loop allows user to repeat the program
        do {
        
            // Clear terminal screen
            clearScreen();
            
            // Java Greeting
            printHelloJava();
            
            // Prompt user for their name
            System.out.print("What is your name?  ");
            userName = keyboard.next();
            
            // Print Greeting specific to user
            personalHello(userName);
            
            // Doing some addition
            System.out.println("Let's do some adding!");
            
            // Input first and second number
            number1 = inputNumber("first");
            number2 = inputNumber("second");
            
            // Calculate answer
            answer = addTwoNumbers(number1, number2);
            
            // Display answer
            System.out.println("The sum of the numbers " + number1 + " and " + number2 + " is " + answer + "."); 
        
            // Prompt user to play again
            System.out.println("Type 'true' to play the program again.");
            System.out.println("Type 'false' quit.");
            System.out.print("Your choice:  ");
            runAgain = playAgain();
        } while (runAgain);
    }
} 