class Circle{
    private float radius;
    protected float area;

    public Circle(float r){
        radius = r;
        area = ((float)Math.PI * r * r);
    }
}

class Cylinder extends Circle{
    private float height;
    float volume;
    public Cylinder(float r, float h){
        super(r);
        height = h;
        volume = area * height;
    }
}

public class CylinderCircle {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(1,5);
        System.out.println(cyl.volume);
    }
}
