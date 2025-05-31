package CodeChallenges;

import java.util.Scanner;

public class numbertomonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();
        
        // Validate input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            return;
        }
        
        // Use switch-case to determine the number of days
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                System.out.println("This month has 31 days.");
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                System.out.println("This month has 30 days.");
                break;
            case 2: // February
                System.out.println("This month has 28 days.");
                break;
            default:
                // This case should never be reached due to input validation
                System.out.println("Unexpected error occurred.");
        }
        
        scanner.close();
    }
}
