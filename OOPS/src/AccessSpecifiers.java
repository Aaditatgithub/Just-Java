class Student{
    private String name;        // access only in this class
    public int PRN;             // access to everyone
    protected char  Division;     // access to inherited classes if any
    String department;          // package access only

    Student(String name, int prn, char division, String dep){
        this.name = name;
        this.PRN = prn;
        this.Division =  division;
        this.department = dep;
    }

}


public class AccessSpecifiers {
    public static void main(String[] args) {
        Student stud =  new Student("Aaditya",21043,'C',"computer");

        // System.out.println(stud.name);      // DOES NOT COMPILE, ONLY METHODS CAN ACCESS
        System.out.println(stud.PRN);
        System.out.println(stud.Division);
        System.out.println(stud.department);
    }
}
