import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    public static void main(String[] args) {
        // Create a cached thread pool
        // used for many shortlived tasks
        // The newCachedThreadPool method creates a thread pool that dynamically adjusts the number of threads based on the workload.
        ExecutorService executor = Executors.newCachedThreadPool();
        
        // Define a task using a lambda expression
        // The task prints a message along with the name of the thread executing it.
        Runnable task = () -> {
            System.out.println("Task executed by " + Thread.currentThread().getName());
        };

        // Submit the task to the executor
        // The submit method is used to submit a task for execution.
        executor.submit(task);

        // Shutdown the executor
        // After shutdown, the executor will not accept new tasks but will continue to execute already submitted tasks.
        executor.shutdown();
    }
}
