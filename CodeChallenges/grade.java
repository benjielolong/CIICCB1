package CodeChallenges;

import java.util.Scanner;

public class grade {
    
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
        
        try {
            // Get student's score
            System.out.print("Enter student's score (0-100): ");
            int score = scanner.nextInt();
            
            // Validate input
            if (score < 0 || score > 100) {
                System.out.println("Invalid score! Please enter a score between 0 and 100.");
                return;
            }
        
        // Determine grade
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display result
        System.out.println("Student's grade: " + grade);
        
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
