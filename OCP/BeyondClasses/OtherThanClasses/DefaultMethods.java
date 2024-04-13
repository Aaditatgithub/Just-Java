

interface InterfaceA {
    // Abstract method
    void methodA();

    // Default method
    default void defaultMethod() {
        System.out.println("Default method from InterfaceA");
    }
}

interface InterfaceB {
    // Abstract method
    void methodB();

    // Default method
    default void defaultMethod() {
        System.out.println("Default method from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Implementation of methodA
    @Override
    public void methodA() {
        System.out.println("Method A implementation");
    }

    // Implementation of methodB
    @Override
    public void methodB() {
        System.out.println("Method B implementation");
    }

    // Resolving conflict between default methods from InterfaceA and InterfaceB
    @Override
    public void defaultMethod() {
        InterfaceA.super.defaultMethod(); // Calling default method from InterfaceA
        InterfaceB.super.defaultMethod(); // Calling default method from InterfaceB
        System.out.println("Custom implementation in MyClass");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.methodA(); // Output: Method A implementation
        myClass.methodB(); // Output: Method B implementation
        myClass.defaultMethod();
        
        // Output:
        // Default method from InterfaceA
        // Default method from InterfaceB
        // Custom implementation in MyClass
    }
}
