import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 2 threads
        // The newFixedThreadPool method creates a fixed-size thread pool.
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Define two tasks using lambda expressions
        // Each task prints a message along with the name of the thread executing it.
        Runnable task1 = () -> {
            System.out.println("Task 1 executed by " + Thread.currentThread().getName());
        };
        
        Runnable task2 = () -> {
            System.out.println("Task 2 executed by " + Thread.currentThread().getName());
        };
        
        // Submit tasks to the executor
        // The submit method is used to submit a task for execution.
        executor.submit(task1);
        executor.submit(task2);

        // Shutdown the executor
        // After shutdown, the executor will not accept new tasks but will continue to execute already submitted tasks.
        executor.shutdown();
    }
}
