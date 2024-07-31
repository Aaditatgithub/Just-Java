

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;

class LongTask {
    public static void simulate() throws InterruptedException {
        Thread.sleep(3000);    
    }
}

public class CallablesAndFuturesExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        try {
            Future<Integer> future = executor.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    LongTask.simulate();
                    return 1;
                }
            });

            // Simulation of doing some other task while the other thread does its long task
            System.out.println("Doing more work....");

            try {
                // This code is synchronous(blocking); other thread thus we async code
                Integer result = future.get();
                System.out.println("Result from future: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        } finally {
            executor.shutdown();
        }
    }
}
