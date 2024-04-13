

interface MyInterface {
    // Constant field (implicitly public, static, and final)
    String INTERFACE_NAME = "MyInterface";

    // Private field not allowed
    // private String privateField = "private field";

    // Abstract method
    void abstractMethod();

    // Default method with implementation, can be overriden
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    // Static method with implementation, can be hidden not overriden
    static void staticMethod() {
        System.out.println("Static method in interface");
    }

    // Private method with implementation
    private void privateMethod() {
        System.out.println("Private method in interface");
    }

    // Private static method with implementation
    private static void privateStaticMethod() {
        System.out.println("Private static method in interface");
    }

    // Method invoking private methods
    default void invokePrivateMethods() {
        privateMethod(); // Invoking private instance method
        privateStaticMethod(); // Invoking private static method
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // Accessing constant field
        System.out.println("Interface Name: " + MyInterface.INTERFACE_NAME);

        // Invoking static method
        MyInterface.staticMethod();

        // Creating anonymous class instance implementing MyInterface
        MyInterface myInterface = new MyInterface() {
            @Override
            public void abstractMethod() {
                System.out.println("Implementing abstract method in anonymous class");
            }
        };

        // Invoking abstract method
        myInterface.abstractMethod();

        // Invoking default method
        myInterface.defaultMethod();

        // Invoking private methods through default method
        myInterface.invokePrivateMethods();

        // Accessing private field
        System.out.println("Accessing private field through accessor method: ");
    }
}
