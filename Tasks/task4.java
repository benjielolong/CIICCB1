package Tasks;

public class task4 {
    
    public static void main(String[] args) {
        
        String inputString = "madam";

         if (isPalindrome(inputString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        
        String reversedString = new StringBuilder(input).reverse().toString();
        
        return input.equals(reversedString);
    }
}
