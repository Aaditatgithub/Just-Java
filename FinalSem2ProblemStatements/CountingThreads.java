class Counter implements Runnable {
    private int start;
    private int end;

    public Counter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            // System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        System.out.println(Thread.currentThread().getName() + " has completed.");
    }
}

public class CountingThreads {
    public static void main(String[] args) {
        int totalCount = 10000;
        int numThreads = 5;
        int numbersPerThread = totalCount / numThreads;

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * numbersPerThread + 1;
            int end = (i + 1) * numbersPerThread;

            // Adjust the last thread's end if totalCount is not perfectly divisible by numThreads
            if (i == numThreads - 1 && end < totalCount) {
                end = totalCount;
            }

            threads[i] = new Thread(new Counter(start, end));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
