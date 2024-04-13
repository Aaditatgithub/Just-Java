import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vehicle {
    private String id;
    private String brand;
    private double rentalRate;

    public Vehicle(String id, String brand, double rentalRate) {
        this.id = id;
        this.brand = brand;
        this.rentalRate = rentalRate;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Rental Rate: $" + rentalRate + " per hour");
    }

    public double calculateRentalCost(int hours) {
        return rentalRate * hours;
    }

    public String getId() {
        return id;
    }
}

class Car extends Vehicle {
    private int numSeats;

    public Car(String id, String brand, double rentalRate, int numSeats) {
        super(id, brand, rentalRate);
        this.numSeats = numSeats;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numSeats);
    }
}

class Bicycle extends Vehicle {
    private String type;

    public Bicycle(String id, String brand, double rentalRate, String type) {
        super(id, brand, rentalRate);
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: " + type);
    }
}

public class Statement8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add a new car");
            System.out.println("2. Add a new bicycle");
            System.out.println("3. Display details of all vehicles");
            System.out.println("4. Rent a vehicle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter car ID: ");
                    String carId = scanner.nextLine();
                    System.out.print("Enter car brand: ");
                    String carBrand = scanner.nextLine();
                    System.out.print("Enter rental rate per hour: ");
                    double carRate = scanner.nextDouble();
                    System.out.print("Enter number of seats: ");
                    int numSeats = scanner.nextInt();
                    vehicles.add(new Car(carId, carBrand, carRate, numSeats));
                    break;
                case 2:
                    System.out.print("Enter bicycle ID: ");
                    String bikeId = scanner.nextLine();
                    System.out.print("Enter bicycle brand: ");
                    String bikeBrand = scanner.nextLine();
                    System.out.print("Enter rental rate per hour: ");
                    double bikeRate = scanner.nextDouble();
                    System.out.print("Enter type of bicycle: ");
                    String type = scanner.next();
                    vehicles.add(new Bicycle(bikeId, bikeBrand, bikeRate, type));
                    break;
                case 3:
                    System.out.println("Details of all vehicles:");
                    for (Vehicle vehicle : vehicles) {
                        vehicle.displayDetails();
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("Enter vehicle ID to rent: ");
                    String rentId = scanner.next();
                    System.out.print("Enter number of hours: ");
                    int rentHours = scanner.nextInt();
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle.getId().equals(rentId)) {
                            double totalCost = vehicle.calculateRentalCost(rentHours);
                            System.out.println("Rental Details:");
                            vehicle.displayDetails();
                            System.out.println("Rented for " + rentHours + " hours");
                            System.out.println("Total Cost: $" + totalCost);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
