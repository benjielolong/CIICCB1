package tasksheets.tasksheet122;

public class MyDate {
    public static void main(String[] args) {
        // Create date1: January 1st of 1978
        DateTask date1 = new DateTask(1, 1, 1978);
        
        // Create date2: September 21st of 1984
        DateTask date2 = new DateTask(9, 21, 1984);
        
        // Display the dates
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        
        // Display leap years between 1978 and 1984
        System.out.println("\nLeap years between " + date1.getYear() + " and " + date2.getYear() + ":");
        for (int year = date1.getYear(); year <= date2.getYear(); year++) {
            if (isLeapYear(year)) {
                System.out.println(year);
            }
        }
    }
    
    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}