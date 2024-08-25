

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RemoteService {
    public static int fetchData() throws InterruptedException {
        // Simulating a delay in fetching data
        Thread.sleep(3000);
        // Simulating an error condition
        if (Math.random() > 0.5) {
            throw new RuntimeException("Service is down");
        }
        return 42;
    }
}

public class CallablesAndFuturesExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        try {
            CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
                try {
                    return RemoteService.fetchData();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, executor);

            System.out.println("Doing more work....");

            future
                .thenAccept(result -> System.out.println("Result from future: " + result))
                .exceptionally(e -> {
                    System.err.println("Exception occurred: " + e.getMessage());
                    return null; // Returning null or any default value
                }) 
                .join(); // Wait for the completion

        } finally {
            executor.shutdown();
        }
    }
}
