class LocalClassExample {

    public void process() {
        final int num1 = 10; // final variable
        int num2 = 20; // effectively final variable

        class LocalClass {
            public void display() {
                // Accessing final and effectively final variables from enclosing scope
                System.out.println("num1: " + num1);
                System.out.println("num2: " + num2);
            }
        }

        // Instantiating the local class and invoking the display method
        LocalClass local = new LocalClass();
        local.display();
    }

public class LocalClass {
    
    public static void main(String[] args) {
        LocalClassExample example = new LocalClassExample();
        example.process();
    }
}    
}
