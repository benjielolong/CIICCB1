package tasksheets.tasksheet151;

import java.util.List;
import java.util.ArrayList;

// School class
class School {
    private String name;
    private String address;
    private List<Department> departments;
    
    public School(String name, String address) {
        this.name = name;
        this.address = address;
        this.departments = new ArrayList<>();
    }
    
    public void addDepartment(Department department) {
        departments.add(department);
    }
    
    // Getters and setters
    public String getName() { return name; }
    public String getAddress() { return address; }
    public List<Department> getDepartments() { return departments; }
}

// Department class
class Department {
    private String name;
    private String code;
    private School school;
    private Teacher masterTeacher;
    private List<Teacher> teachers;
    private List<Office> offices;
    
    public Department(String name, String code, School school) {
        this.name = name;
        this.code = code;
        this.school = school;
        this.teachers = new ArrayList<>();
        this.offices = new ArrayList<>();
        school.addDepartment(this);
    }
    
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        teacher.setDepartment(this);
    }
    
    public void setMasterTeacher(Teacher teacher) {
        if (teachers.contains(teacher)) {
            this.masterTeacher = teacher;
        }
    }
    
    public void addOffice(Office office) {
        offices.add(office);
    }
    
    // Getters and setters
    public String getName() { return name; }
    public Teacher getMasterTeacher() { return masterTeacher; }
    public List<Teacher> getTeachers() { return teachers; }
    public List<Office> getOffices() { return offices; }
}

// Office class
class Office {
    private String roomNumber;
    private int capacity;
    private Department department;
    private boolean isFacultyRoom;
    
    public Office(String roomNumber, int capacity, Department department, boolean isFacultyRoom) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.department = department;
        this.isFacultyRoom = isFacultyRoom;
        department.addOffice(this);
    }
    
    // Getters and setters
    public String getRoomNumber() { return roomNumber; }
    public int getCapacity() { return capacity; }
    public boolean isFacultyRoom() { return isFacultyRoom; }
    public Department getDepartment() { return department; }
}

// FacultyRoom class (extends Office)
class FacultyRoom extends Office {
    private List<Teacher> assignedTeachers;
    
    public FacultyRoom(String roomNumber, int capacity, Department department) {
        super(roomNumber, capacity, department, true);
        this.assignedTeachers = new ArrayList<>();
    }
    
    public void assignTeacher(Teacher teacher) {
        if (!assignedTeachers.contains(teacher)) {
            assignedTeachers.add(teacher);
        }
    }
    
    public List<Teacher> getAssignedTeachers() {
        return assignedTeachers;
    }
}

// Teacher class
class Teacher {
    private String name;
    private String employeeId;
    private Department department;
    
    public Teacher(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
    
    // Getters
    public String getName() { return name; }
    public String getEmployeeId() { return employeeId; }
    public Department getDepartment() { return department; }
}

public class SchoolClassDiagram {
    public static void main(String[] args) {
        // Example usage
        School school = new School("Sample University", "123 Education St.");
        
        // Create departments
        Department csDept = new Department("Computer Science", "CS", school);
        Department mathDept = new Department("Mathematics", "MATH", school);
        
        // Create offices
        Office csOffice1 = new Office("CS-101", 5, csDept, false);
        FacultyRoom csFacultyRoom = new FacultyRoom("CS-201", 10, csDept);
        
        // Create teachers
        Teacher teacher1 = new Teacher("John Doe", "T001");
        Teacher teacher2 = new Teacher("Jane Smith", "T002");
        
        // Add teachers to department
        csDept.addTeacher(teacher1);
        csDept.addTeacher(teacher2);
        
        // Set master teacher
        csDept.setMasterTeacher(teacher1);
        
        // Assign teacher to faculty room
        csFacultyRoom.assignTeacher(teacher1);
        
        // Print some information
        System.out.println("School: " + school.getName());
        System.out.println("Department: " + csDept.getName());
        System.out.println("Master Teacher: " + csDept.getMasterTeacher().getName());
        System.out.println("Number of teachers: " + csDept.getTeachers().size());
        System.out.println("Number of offices: " + csDept.getOffices().size());
    }
}