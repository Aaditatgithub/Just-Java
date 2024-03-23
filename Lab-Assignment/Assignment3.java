import java.util.Scanner;

class Shape {
    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a square
    public double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius, String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return Math.PI * radius * radius;
        } else {
            return -1; // Invalid shape
        }
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("Choose a shape: ");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter base length of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = shape.calculateArea(base, height);
                System.out.println("Area of triangle: " + triangleArea);
                break;
            case 2:
                System.out.print("Enter side length of square: ");
                double side = scanner.nextDouble();
                double squareArea = shape.calculateArea(side);
                System.out.println("Area of square: " + squareArea);
                break;
            case 3:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                double circleArea = shape.calculateArea(radius, "circle");
                System.out.println("Area of circle: " + circleArea);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
