import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPools{
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(2);
        System.out.println(executor.getClass().getName());
    }
}