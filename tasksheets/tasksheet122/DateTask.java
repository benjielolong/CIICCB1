package tasksheets.tasksheet122;

public class DateTask {
    private int day;
    private int month;
    private int year;
    private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public DateTask() {
        this(1, 1, 1);
    }

    public DateTask(int month, int day, int year) {
        setDate(month, day, year);
    }

    public void setDate(int month, int day, int year) {
        if (setMonth(month) == 0 || setDay(day) == 0 || setYear(year) == 0) {
            System.out.println("Invalid date");
        }
    }

    public int setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
            return 1;
        }
        return 0;
    }

    public int setDay(int day) {
        int maxDays = daysInMonth[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDays = 29;
        }
        if (day > 0 && day <= maxDays) {
            this.day = day;
            return 1;
        }
        return 0;
    }

    public int setYear(int year) {
        if (year >= 1) {
            this.year = year;
            return 1;
        }
        return 0;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }
}