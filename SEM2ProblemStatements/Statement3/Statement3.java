package Statement3;
import java.nio.channels.ShutdownChannelGroupException;

abstract class Shape{
    abstract void calculateArea();
    abstract void calculatePerimeter();
    abstract void displayDetails();
}

class Circle extends Shape{
    float r;

    public Circle(float radius){
        r = radius;
    }

    void calculateArea(){
        System.out.println(Math.PI*r*r);
    }

    void calculatePerimeter(){
        System.out.println(2*Math.PI*r);
    }

    void displayDetails(){
        System.out.println("Radius of circle is: " + r);
    }
}

class Triangle extends Shape{
    float a,b,c;
    void calculateArea(){
        System.out.println((b*c/2));
    }

    void calculatePerimeter(){
        System.out.println(a+b+c);
    }

    void displayDetails(){
        System.out.println("Sides of triangle are: " + a + ", " + b + ", " + c);
    }

}

class Rectangle extends Shape{
    float l,b;

    public Rectangle(float length, float breadth){
        l = length;
        b = breadth;
    }
    void calculateArea(){
        System.out.println((l*b));
    }

    void calculatePerimeter(){
        System.out.println(2*(l+b));
    }

    void displayDetails(){
        System.out.println("Sides of rectangle are:: length: " + l + ", breadth: " + b);
    }
}

public class Statement3 {
    public static void main(String... args){
        Shape circle = new Circle(3);
        circle.calculateArea();
        circle.displayDetails();

        Shape rect = new Rectangle(4,5);
        rect.calculateArea(); 
        rect.calculatePerimeter();
    }
}
