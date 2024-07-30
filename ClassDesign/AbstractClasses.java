package ClassDesign;

abstract class Fish {
    // Abstract method
    abstract void swim();

    // Concrete method
    void inWater() {
        System.out.println("Fish is swimming!!!");
    }
}

abstract class Whale extends Fish {
    // Abstract method
    abstract void sing();
}

class SharkWhale extends Whale {
    // Implementation of abstract method from Fish class
    void swim() {
        System.out.println("SharkWhale swims in the ocean");
    }

    // Implementation of abstract method from Whale class
    void sing() {
        System.out.println("SharkWhale sings in the deep ocean");
    }

    // Overriding the concrete method from Fish class
    @Override
    void inWater() {
        System.out.println("SharkWhale is swimming!!!");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        SharkWhale sharkWhale = new SharkWhale();
        sharkWhale.swim(); // Output: SharkWhale swims in the ocean
        sharkWhale.sing(); // Output: SharkWhale sings in the deep ocean
        sharkWhale.inWater(); // Output: SharkWhale is swimming!!!
    }
}
