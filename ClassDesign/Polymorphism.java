package ClassDesign;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

class Bird {
    boolean livesInAntarctica = false;

    public boolean hasFeathers() {
        return true;
    }

    public void fly() throws IOException {
        System.out.println("Bird flying");
    }
}

class Penguin extends Bird {

    boolean livesInAntarctica = true;

    // Rule 1: Method Signature must be the same
    // Covariant return type: Bird hasFeathers method returns boolean, Penguin overrides it with Boolean
    @Override
    public boolean hasFeathers() {
        return false;
    }

    // Rule 3: Exception scope <=  IOexception
    @Override
    public void fly() throws FileAlreadyExistsException {
        System.out.println("Penguin sliding"); // Penguin's version of fly method
    }   
}

public class Polymorphism {
    public static void main(String[] args) {
        Bird peng1 = new Bird();
        Penguin peng3 = new Penguin();

        Bird p = peng3;
        System.out.println(peng3.livesInAntarctica);
        System.out.println(p.livesInAntarctica); // Reference of parent class points to child class' objects;

        try {
            peng1.fly(); // Bird flying
            peng3.fly(); // Penguin sliding
            p.fly();     // Penguin sliding (Covariant return type)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Rules for Polymorphism
// 1. The method in the child class must have the same signature as the method in the
//    parent class.
// 2. The method in the child class must be at least as accessible as the method in the
//    parent class.
// 3. The method in the child class may not declare a checked exception that is new or
//    broader than the class of any exception declared in the parent class method.
// 4. If the method returns a value, it must be the same or a subtype of the method in the parent
//    class, known as covariant return types.
// 5. The method defined in the child class must be marked as static if it is marked as
//    static in a parent class.
// 6. A hidden variable occurs when a child class defines a variable with the same name as an
//    inherited variable defined in the parent class.