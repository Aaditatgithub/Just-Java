class Base{
    int x;
    public void setX(int a){
        this.x = a;
    }
    public int getX(){
        return x;
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Derived num = new Derived();
    }
}
