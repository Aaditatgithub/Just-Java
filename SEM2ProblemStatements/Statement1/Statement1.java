package Statement1;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


class Student{
    String name;
    String grade;
    int rollNumber;

    @Override
    public String toString(){
        return ("Student { Name: " + name  + " RollNumber: " + rollNumber + "Grade: " + grade + "}");
    }
}

class StudentManager {
    List<Student> students;

    public StudentManager(){
        students = new ArrayList<>();
    }

    void addStudent(Student student){
        students.add(student);
    }

    boolean removeStudent(Integer rollNumber){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student currStudent = iterator.next();
            if(currStudent.rollNumber == rollNumber){
               iterator.remove();
                return true;
            }
        }
        return false;
    }

    void displayAllStudents(){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    boolean replaceGrade(int rollNumber, String grade){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student currStudent = iterator.next();
            if(currStudent.rollNumber == rollNumber){
                currStudent.grade = grade;
                return true;
            }
        }
        return false;
    }

}

public class Statement1 {
    public static void main(String[] args){
        StudentManager studentManager = new StudentManager();
        Scanner input = new Scanner(System.in);
        int choice;
        do{
            System.out.println("""
                ------------MENU-------------
                1. Add Student
                2. Remove Student
                3. Display All Students
                4. Replace grade of Student
            -------------------------------------
            """);
            choice = input.nextInt();
            input.nextLine();
        switch(choice){
            case 1:
                Student newStudent = new Student();
                System.out.println("Enter name: ");
                newStudent.name = input.nextLine();
                System.out.println("Enter rollNo: ");
                newStudent.rollNumber = input.nextInt();
                input.nextLine();
                System.out.println("Enter grade: ");
                newStudent.grade = input.nextLine();
                studentManager.addStudent(newStudent);
                break;

            case 2: 
                System.out.println("Enter rollNo: ");
                int rollNumber = input.nextInt();
                input.nextLine();
                if(studentManager.removeStudent(rollNumber)){
                    System.out.println("Response Message: Student wasa successfully removed.");
                }
                else{
                    System.out.println("Response Message: Student was not found.");
                };
                break;

            case 3:
                studentManager.displayAllStudents();
                break;
            
            case 4: 
                System.out.println("Enter rollNo: ");
                rollNumber = input.nextInt();
                input.nextLine();
                System.out.println("Enter grade: ");
                String grade = input.nextLine();
                studentManager.replaceGrade(rollNumber, grade);
                break;
                
        }
        }while(choice != 0);
       

    }
}