class Student{
     final int stipend;
     String name;
     int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
        this.stipend = 100;
    }

    int calculateStipend(){
        if(marks >= 85 && marks < 90){
            return stipend + 10;
        }
        else if(marks >= 90 && marks < 95){
            return stipend + 15;
        }
        else if(marks >= 95 && marks < 100){
            return stipend + 20;
        }
        else{
            return stipend;
        }
    }
}

public class Mystatement2 {
    public static void main(String[] args) {
        Student student = new Student("Jaiswal", 96);
        System.out.println("Stipends---\n" + "Name: " + student.name + "\nStipend: " + student.calculateStipend());        
    }   
}
