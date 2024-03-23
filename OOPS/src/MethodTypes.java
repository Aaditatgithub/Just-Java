class Random{
    private static int variable;
    static{
        variable = 23;
    }
    private int a;
    
    Random() {a = 12;}

    int instanceMethod(){
        return a;
    }

    static int staticMethod(){
        return variable;
    }
}

public class MethodTypes{
    public static void main(String[] args) {
        System.out.println(Random.staticMethod());

        Random object = new Random();
        System.out.println(object.instanceMethod());
    }
}
