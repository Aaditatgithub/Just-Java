import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class DownloadStatus{
    private boolean isDone;
    private AtomicInteger totalBytes = new AtomicInteger();
    private int totalFiles;

    public AtomicInteger getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes(){
        this.totalBytes.incrementAndGet();
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


public class AtomicObjects {
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
