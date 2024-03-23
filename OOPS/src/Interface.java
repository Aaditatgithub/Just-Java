interface canine{
   void scream();
}

class Lion implements canine{
    public void scream(){
        System.out.println("roar");
    }
}

public class Interface {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.scream();
    }
}
