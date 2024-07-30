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
