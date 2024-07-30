import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

class DownloadStatus{
    private boolean isDone;

    //When multiple threads are updating a value freq. its better to use Adder class
    private LongAdder totalBytes = new LongAdder();
    private int totalFiles;

    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public void incrementTotalBytes(){
        totalBytes.increment();
    }

    public void incrementTotalFiles(){
        totalFiles++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }
}

class DownloadFileTask implements Runnable{

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status){
        this.status = status;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10_000; i++) {
            status.incrementTotalBytes();
        }

        System.out.println("Download Complete " + Thread.currentThread().getName());
    }
}


public class Adders {
    public static void main(String[] args) {
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(new DownloadFileTask(status)));
            threads.get(i).start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(status.getTotalBytes());
    }
}
