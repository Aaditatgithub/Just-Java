    public class ConstructorTypes {
    private int value;

    // Non-parameterized constructor
    public ConstructorTypes() {
        System.out.println("Non-parameterized constructor called");
        // Initialize default values
        this.value = 0;
    }

    // Parameterized constructor
    public ConstructorTypes(int value) {
        System.out.println("Parameterized constructor called");
        // Initialize object with the provided value
        this.value = value;
    }

    // Copy constructor
    public ConstructorTypes(ConstructorTypes other) {
        System.out.println("Copy constructor called");
        // Copy values from the other object
        this.value = other.value;
    }

    // Getter method for the 'value' field
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Using non-parameterized constructor
        ConstructorTypes obj1 = new ConstructorTypes();
        System.out.println("Value of obj1: " + obj1.getValue() + "\n");

        // Using parameterized constructor
        ConstructorTypes obj2 = new ConstructorTypes(42);
        System.out.println("Value of obj2: " + obj2.getValue() + "\n");

        // Using copy constructor
        ConstructorTypes obj3 = new ConstructorTypes(obj2);
        System.out.println("Value of obj3 (copied from obj2): " + obj3.getValue() + "\n");
    }
}
