interface Drawable{
    void draw();
}

interface Resizable{
    void resize(double factor);
}

class Circle implements Drawable, Resizable{
    float radius;

    public Circle(float r){
        radius = r;
    }
    @Override
    public void draw(){
        System.out.println("Radius: " + radius);
        System.out.println("Area: ");
    }

    @Override
    public void resize(double factor){
        radius *= factor;
    }
}

class Rectangle implements Drawable{
    float length, breadth;

    @Override
    public void draw(){
        System.out.println("(Length, Breadth) : (" + length + "," + breadth + ") ");
    }
}



public class Statement7 {
    public static void main(String[] args) {
        Circle circle = new Circle(2.75f);
    }
}
