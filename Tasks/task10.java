package Tasks;

class Student {
    private String firstName;
    private String lastName;
    
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // Method to print the full name of the student
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }
}

public class task10 {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey")
        };
        
        // Print full names of all students
        for (Student s : students) {
            s.printFullName();
        }
    }
}