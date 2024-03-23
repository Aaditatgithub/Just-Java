package ClassDesign;

class Parent {
    private String parentName;

    // Parameterized constructor
    public Parent(String parentName) {
        this.parentName = parentName;
        System.out.println("Parent Parameterized Constructor: " + parentName);
    }

    // Default constructor
    public Parent() {
        this("Unknown");
        System.out.println("Parent Default Constructor");
    }
}

class Child extends Parent {
    private String childName;

    // Parameterized constructor
    public Child(String parentName, String childName) {
        super(parentName); // Calling parameterized constructor of the superclass
        this.childName = childName;
        System.out.println("Child Parameterized Constructor: " + childName);
    }

    // Default constructor
    public Child() {
        this("Parent", "Unknown");
        System.out.println("Child Default Constructor");
    }

    // Constructor using both super() and this()
    public Child(String childName) {
        this(); // Calls the default constructor of the same class
        // The default constructor calls the parameterized constructor of the parent class
        this.childName = childName;
        System.out.println("Child Constructor using super() and this(): " + childName);
    }
}

public class Constructors {
    public static void main(String[] args) {
        System.out.println("Creating Parent object:");
        Parent parent = new Parent("John");

        System.out.println("\nCreating Child objects:");
        Child child1 = new Child("Alice", "Bob");

        System.out.println();

        // Creating a Child object using the constructor with both super() and this()
        Child child2 = new Child("Charlie");
    }
}
