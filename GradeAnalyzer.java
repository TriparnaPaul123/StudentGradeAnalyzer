import java.util.Scanner; // Import Scanner class for user input

// Define a Student class to store and process student data
class Student {
    String name; // Student's name
    int roll; // Student's roll number
    int[] marks = new int[3]; // Array to store marks in 3 subjects
    int total; // Total marks
    double average; // Average marks
    char grade; // Grade assigned based on average

    // Method to calculate total and average marks
    void calculateTotalAndAverage() {
        total = marks[0] + marks[1] + marks[2];
        average = total / 3.0;
    }

    // Method to assign grade based on average marks
    void assignGrade() {
        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 50) grade = 'C';
        else grade = 'F'; // Fail grade
    }

    // Method to display student details and performance
    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
        System.out.println("Total: " + total + ", Average: " + average + ", Grade: " + grade);
    }
}

// Main class to run the grade analyzer program
public class GradeAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Prompt user for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Create an array to store Student objects
        Student[] students = new Student[n];

        // Loop to input data for each student
        for (int i = 0; i < n; i++) {
            students[i] = new Student(); // Initialize Student object
            System.out.println("Enter details for Student " + (i + 1));

            // Input student name
            System.out.print("Name: ");
            students[i].name = sc.next();

            // Input roll number
            System.out.print("Roll Number: ");
            students[i].roll = sc.nextInt();

            // Input marks for 3 subjects
            System.out.print("Enter marks in 3 subjects: ");
            for (int j = 0; j < 3; j++) {
                students[i].marks[j] = sc.nextInt();
            }

            // Calculate total, average and assign grade
            students[i].calculateTotalAndAverage();
            students[i].assignGrade();
        }

        // Display report for all students
        System.out.println("\n--- Student Report ---");
        for (Student s : students) {
            s.display();
            System.out.println("----------------------");
        }
    }
}
