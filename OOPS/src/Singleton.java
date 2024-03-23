public class Singleton {
    static int instance_count;

    static{
        instance_count = 0;
    }

    // Private constructor to prevent direct instantiation
    private Singleton() {
        // Initialization code, if any
    }

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        instance_count++;
        return new Singleton();
    }

    // Example method in the singleton class
    public void doSomething() {
        System.out.println("Instances were doing something.");
    }

    public static void main(String[] args) {
        // Getting an instance of the singleton
        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();
        Singleton singletonInstance3 = Singleton.getInstance();

        System.out.println(instance_count);

        // Using the singleton instance
        singletonInstance1.doSomething();
    }
}
