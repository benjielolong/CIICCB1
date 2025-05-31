package Tasks;

public class task8 {
    
    public static int calculateCumulativeSum(int n) {
        return n * (n + 1) / 2;
    }
    

    public static int processNumbers(int... numbers) {
        int totalSum = 0;
        
        System.out.println("Processing numbers:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int cumulativeSum = calculateCumulativeSum(num);
            totalSum += cumulativeSum;
            
            System.out.printf("Number %d: Sum(1 to %d) = %d\n", 
                            (i + 1), num, cumulativeSum);
        }
        
        return totalSum;
    }
    
    public static void main(String[] args) {

        int total = processNumbers(4, 5, 10);
        
        System.out.println("\nTotal of all cumulative sums: " + total);
        
    
        System.out.println("\nAnother example:");
        total = processNumbers(3, 7, 2, 6);
        System.out.println("Total of all cumulative sums: " + total);
    }
}

