import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the number of students:");
            int numberOfStudents = scanner.nextInt();
            
            String[] studentNames = new String[numberOfStudents];
            int[] marks = new int[numberOfStudents];
            
            // Input student names and marks
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Enter the name of student " + (i + 1) + ":");
                String name = scanner.next();
                
                // Handle null name scenario
                if (name.equals("null")) {
                    throw new NullPointerException("Student name cannot be null");
                }
                
                studentNames[i] = name;
                
                System.out.println("Enter the marks of " + name + ":");
                int mark = scanner.nextInt();
                
                // Handle invalid mark scenario
                if (mark < 0 || mark > 100) {
                    throw new IllegalArgumentException("Invalid marks: Marks should be between 0 and 100");
                }
                marks[i] = mark;
            }
            
            // Output student names and marks
            System.out.println("Student marks:");
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println(studentNames[i] + ": " + marks[i]);
            }
            
            // Perform division operation
            System.out.println("Convert student marks by distribution:");
            int dividend = 10;
            System.out.println("Enter the divisor:");
            int divisor = scanner.nextInt();
            
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            
            int quotient = dividend / divisor;
            System.out.println("Quotient: " + quotient);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index is out of bounds");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        scanner.close();
    }
}
