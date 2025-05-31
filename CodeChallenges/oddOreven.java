package CodeChallenges;

import java.util.Scanner;

public class oddOreven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            String sign = (number > 0) ? "positive" : "negative";
            String parity = (number % 2 == 0) ? "even" : "odd";
            System.out.println("The number is " + sign + " and " + parity + ".");
        }
        scanner.close();
    }
}
