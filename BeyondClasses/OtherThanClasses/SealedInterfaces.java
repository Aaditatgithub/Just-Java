sealed interface Shape permits Circle, Square {
    double area();
}

final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

final class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

// This class is not permitted to implement Shape, so it will result in a compilation error
// class Triangle implements Shape {
//     // Implementation for Triangle class
// }

public class SealedInterfaces {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());

        Square square = new Square(4);
        System.out.println("Square area: " + square.area());
    }
}
