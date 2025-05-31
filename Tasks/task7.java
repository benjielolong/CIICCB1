package Tasks;

import java.util.Scanner;

public class task7 {
    // Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    
    // Method to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    // Method to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    // Method to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN; // Return Not a Number for division by zero
        }
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform calculations using the methods
        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double quotient = divide(num1, num2);
        
        // Display results
        System.out.println("\nResults:");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        
        // Only show division result if it's valid
        if (!Double.isNaN(quotient)) {
            System.out.println(num1 + " / " + num2 + " = " + quotient);
        }
        
        scanner.close();
    }
}