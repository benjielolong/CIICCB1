package CodeChallenges;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // 1. Find and print the length of the string
        System.out.println("1. Length of the string: " + input.length());
        
        // 2. Convert to uppercase and print
        System.out.println("2. String in uppercase: " + input.toUpperCase());
        
        // 3. Convert to lowercase and print
        System.out.println("3. String in lowercase: " + input.toLowerCase());
        
        // 4. Print the first character
        if (!input.isEmpty()) {
            System.out.println("4. First character: " + input.charAt(0));
        } else {
            System.out.println("4. String is empty, no first character");
        }
        
        // 5. Print the last character
        if (!input.isEmpty()) {
            System.out.println("5. Last character: " + input.charAt(input.length() - 1));
        } else {
            System.out.println("5. String is empty, no last character");
        }
        
        // 6. Print substring from second to fifth character
        if (input.length() >= 5) {
            System.out.println("6. Substring from 2nd to 5th character: " + 
                input.substring(1, 5));
        } else {
            System.out.println("6. String is too short for substring operation");
        }
        
        scanner.close();
    }
}
