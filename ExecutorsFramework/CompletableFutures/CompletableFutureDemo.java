package CompletableFutures;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

class CompletableFutureDemo {
    public static void show() {
        // ForkJoinPool.commonPool();      // returns pool used by completable future class
        // Runtime.getRuntime().availableProcessors();
       
        Supplier<Integer> task = () -> 1;

        var future =  CompletableFuture.supplyAsync(task);   
        try {
            var result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }  
    }   
}
