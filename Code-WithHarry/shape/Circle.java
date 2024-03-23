package shape;

public class Circle{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double Perimeter(){
        return Math.PI*2*radius;
    }
    public double CircularArea(){   
        return Math.PI*Math.pow(radius, 2);
    }
}
