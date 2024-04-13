import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Integer> grades;

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    // Getter and setter methods for student_id
    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    // Getter and setter methods for student_name
    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    // Method to add grade to grades ArrayList
    public void addGrade(int grade) {
        // Additional validation (e.g., range check)
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully.");
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }

    // Method to display all grades
    public void displayGrades() {
        System.out.println("Grades for " + student_name + " (ID: " + student_id + "):");
        for (int grade : grades) {
            System.out.println(grade);
        }
    }
}

public class Statement10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your marks (separated by spaces): ");
        String marksInput = scanner.nextLine();

        String[] marksArray = marksInput.split(" ");
        ArrayList<Integer> marks = new ArrayList<>();
        for (String mark : marksArray) {
            marks.add(Integer.parseInt(mark));
        }

        Student student = new Student(id, name);

        for (int mark : marks) {
            student.addGrade(mark);
        }

        student.displayGrades();

        scanner.close();
    }
}
