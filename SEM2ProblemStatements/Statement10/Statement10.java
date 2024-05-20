package Statement10;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String grade;
    private String contactInfo;

    // Constructor
    public Student(String id, String name, int age, String gender, String grade, String contactInfo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Gender: " + gender + 
               ", Grade: " + grade + ", Contact Info: " + contactInfo;
    }
}


public class Statement10 {
    private static ArrayList<Student> students = new ArrayList<>();
    private static final String adminUsername = "admin";
    private static final String adminPassword = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Admin login
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (!adminUsername.equals(username) || !adminPassword.equals(password)) {
            System.out.println("Invalid login!");
            return;
        }

        // Menu-driven program
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    removeStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    searchStudent(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    // Method to add a new student
    private static void addStudent(Scanner scanner) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println("Student with this ID already exists.");
                return;
            }
        }
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();
        System.out.print("Enter contact info: ");
        String contactInfo = scanner.nextLine();

        students.add(new Student(id, name, age, gender, grade, contactInfo));
        System.out.println("Student added successfully.");
    }

    // Method to remove a student
    private static void removeStudent(Scanner scanner) {
        System.out.print("Enter ID of the student to remove: ");
        String id = scanner.nextLine();
        boolean removed = students.removeIf(student -> student.getId().equals(id));
        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to update student information
    private static void updateStudent(Scanner scanner) {
        System.out.print("Enter ID of the student to update: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new age: ");
                int age = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                System.out.print("Enter new gender: ");
                String gender = scanner.nextLine();
                System.out.print("Enter new grade: ");
                String grade = scanner.nextLine();
                System.out.print("Enter new contact info: ");
                String contactInfo = scanner.nextLine();

                student.setName(name);
                student.setAge(age);
                student.setGender(gender);
                student.setGrade(grade);
                student.setContactInfo(contactInfo);

                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to display all students
    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the database.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Method to search for a student
    private static void searchStudent(Scanner scanner) {
        System.out.println("Search by:");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.println("3. Grade");
        System.out.println("4. Other");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                for (Student student : students) {
                    if (student.getId().equals(id)) {
                        System.out.println(student);
                        return;
                    }
                }
                System.out.println("Student not found.");
                break;
            case 2:
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                for (Student student : students) {
                    if (student.getName().equalsIgnoreCase(name)) {
                        System.out.println(student);
                        return;
                    }
                }
                System.out.println("Student not found.");
                break;
            case 3:
                System.out.print("Enter grade: ");
                String grade = scanner.nextLine();
                for (Student student : students) {
                    if (student.getGrade().equalsIgnoreCase(grade)) {
                        System.out.println(student);
                        return;
                    }
                }
                System.out.println("Student not found.");
                break;
            case 4:
                System.out.print("Enter search criteria: ");
                String criteria = scanner.nextLine();
                for (Student student : students) {
                    if (student.getContactInfo().equalsIgnoreCase(criteria)) {
                        System.out.println(student);
                        return;
                    }
                }
                System.out.println("Student not found.");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
