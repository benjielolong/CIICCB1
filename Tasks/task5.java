package Tasks;

import java.util.Scanner;

public class task5 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        // enter three different numbers
        do {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();

            System.out.print("Enter the third number: ");
            num3 = scanner.nextInt();

            if (num1 == num2 && num2 == num3) {
                System.out.println("All numbers are equal. Please enter three different numbers.\n");
            }
        } while (num1 == num2 && num2 == num3);

        // this code will show the largest number
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("\nThe largest number is: " + largest);
        scanner.close();
    }
}
