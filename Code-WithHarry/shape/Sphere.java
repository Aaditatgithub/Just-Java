package shape;

public class Sphere extends Circle {
    public Sphere(int r){
        super(r);
    }
    public double calcSurfaceArea(){
        return 4*CircularArea();
    }
    public double Volume(){
        return (4.0f / 3.0)*CircularArea()*getRadius();
    }
}
