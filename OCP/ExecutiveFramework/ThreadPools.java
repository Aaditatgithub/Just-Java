import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPools{
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(2);

        try{
            for(int i = 0; i < 10; i++){
                //Submit calls the constructor to create a thread with lambda implementing runnable
               executor.submit(() -> System.out.println(Thread.currentThread().getName()));
           }
        }catch(Exception e) {System.out.println(e.getLocalizedMessage());}
        finally{
            executor.shutdown();
        }

       
    }
}