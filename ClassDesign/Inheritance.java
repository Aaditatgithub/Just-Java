package ClassDesign;

class Vehicle {
    private String brand;
    protected int year;

    // Parameterized constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Default constructor
    public Vehicle() {
        this("Unknown", 0); // Calls parameterized constructor with default values
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    // Parameterized constructor
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Calls parameterized constructor of the superclass
        this.numberOfDoors = numberOfDoors;
    }

    // Default constructor
    public Car() {
        this("Unknown", 0, 0); // Calls parameterized constructor with default values
    }

    @Override
    public void display() {
        super.display(); // Calls display method of the superclass
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        myCar.display(); // Displaying details of the car
    }
}
