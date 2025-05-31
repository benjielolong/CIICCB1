package CodeChallenges;

import java.util.Scanner;

public class LooptoGeneratePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();
        
        // Validate input
        if (rows <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        // Generate pattern
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            
            // Print numbers in reverse
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
