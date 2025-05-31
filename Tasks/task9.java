package Tasks;

import static java.lang.Math.addExact;
import static java.lang.Math.subtractExact;
import static java.lang.Math.multiplyExact;
import static java.lang.Math.floorDiv;

public class task9 {
    
    public static int add(int a, int b) {
        return addExact(a, b);
    }
    
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }
    
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }
    
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return floorDiv(a, b);
    }
    
    public static void main(String[] args) {
        // Demonstrate addition
        int sum = add(10, 5);
        System.out.println("10 + 5 = " + sum);
        
        // Demonstrate subtraction
        int difference = subtract(15, 7);
        System.out.println("15 - 7 = " + difference);
        
        // Demonstrate multiplication
        int product = multiply(6, 8);
        System.out.println("6 * 8 = " + product);
        
        // Demonstrate division
        try {
            int quotient = divide(20, 4);
            System.out.println("20 / 4 = " + quotient);
            
            // This will throw an exception
            // int zeroDivision = divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
