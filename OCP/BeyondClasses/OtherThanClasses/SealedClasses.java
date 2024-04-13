

abstract sealed class Shape permits Circle, Square, Triangle {
    // Common properties and methods for all shapes can be defined here
    public abstract double area();
}

final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

final class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

final class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Trying to extend Shape with a class outside of permits list results in compile-time error
// class Rectangle extends Shape {} // This will give a compilation error

public class SealedClasses {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());

        Square square = new Square(4);
        System.out.println("Square area: " + square.area());

        Triangle triangle = new Triangle(3, 6);
        System.out.println("Triangle area: " + triangle.area());
    }
}
