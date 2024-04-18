public class GettingStarted{
    public static void main(String[] args) {

        //Number of active threads
        System.out.println(Thread.activeCount());
        
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}