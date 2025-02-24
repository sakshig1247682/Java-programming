// TCS Technical Coding Interview Question on OOPs Concept
// Question:
// Design a Student Management System using Object-Oriented Programming (OOP) principles. The system should include the following:

// A Student class with attributes: studentID, name, age, and marks.
// Methods to:
// Display student details (displayDetails method).
// Determine if the student has passed (isPassed method: passing marks >= 40).
// Update marks (updateMarks method).
// Implement encapsulation by keeping attributes private and using getter and setter methods.

// Student Class Demonstrating OOP Concepts
class Student {
    private int studentID;
    private String name;
    private int age;
    private double marks;

    // Constructor to initialize student details
    public Student(int studentID, String name, int age, double marks) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Getter methods for encapsulation
    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Status: " + (isPassed() ? "Passed" : "Failed"));
    }

    // Method to check if student has passed (passing marks >= 40)
    public boolean isPassed() {
        return marks >= 40;
    }

    // Method to update marks
    public void updateMarks(double newMarks) {
        if (newMarks >= 0 && newMarks <= 100) {
            this.marks = newMarks;
            System.out.println("Marks updated successfully.");
        } else {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        }
    }

    // Main method to test functionality
    public static void main(String[] args) {
        // Creating a student object
        Student student = new Student(101, "Alice", 20, 35);

        // Display student details
        student.displayDetails();

        // Updating marks
        student.updateMarks(45);

        // Display updated details
        student.displayDetails();
    }
}

