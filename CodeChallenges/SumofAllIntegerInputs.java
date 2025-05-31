package CodeChallenges;

import java.util.Scanner;

public class SumofAllIntegerInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter numbers (type 'stop' to finish): ");
        
        while (true) {
            String input = scanner.nextLine();
            
            // Check if user wants to stop
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            
            try {
                // Convert input to integer and add to sum
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }
        }
        
        System.out.println("The sum of all numbers is: " + sum);
        scanner.close();
    }
}   
