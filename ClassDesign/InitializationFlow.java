package ClassDesign;

class Parent {
    static {
        System.out.println("Static initialization block of Parent class");
    }

    static int parentStaticVariable = 10;

    {
        System.out.println("Instance initialization block of Parent class");
    }

    public Parent() {
        System.out.println("Constructor of Parent class");
    }
}

class Child extends Parent {
    static {
        System.out.println("Static initialization block of Child class");
    }

    static int childStaticVariable = 20;

    {
        System.out.println("Instance initialization block of Child class");
    }

    public Child() {
        System.out.println("Constructor of Child class");
    }
}

public class InitializationFlow {
    static {
        System.out.println("Static initialization block of Main class");
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        Child child = new Child();
    }
}


// OUTPUT
    // Static initialization block of Parent class
    // Static initialization block of Child class
    // Static initialization block of Main class
    // Inside main method
    // Instance initialization block of Parent class
    // Constructor of Parent class
    // Instance initialization block of Child class
    // Constructor of Child class
