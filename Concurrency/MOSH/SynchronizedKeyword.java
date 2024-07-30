import java.util.ArrayList;
import java.util.List;

class DownloadStatus {
    private int totalBytes;
    private int totalFiles;
    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }
    public int getTotalFiles() {
        return totalFiles;
    }

    public void incrementTotalFiles(){
        synchronized(this) {
            totalFiles++;
        }
    }

    // Above function and this one are equivalent. They are synchronized on same monitor object
    // Prefer using synchronized(LockForAResource) {}
    public synchronized void incrementTotalBytes(){
        totalBytes++;
    }
}

class DownloadFile implements Runnable{

    private DownloadStatus status;
    public DownloadFile(DownloadStatus status){
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file " + Thread.currentThread().getName());
        for (int i = 0; i < 10000; i++) {
            status.incrementTotalBytes();   
        }
    }
}


public class SynchronizedKeyword {
 public static void main(String[] args) {

    List<Thread> threads = new ArrayList<>();
    DownloadStatus status = new DownloadStatus();

    for (int i = 0; i < 10; i++) {
        var thread = new Thread(new DownloadFile(status));
        thread.start();
        threads.add(thread);
    }

    for (Thread thread : threads) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    System.out.println(status.getTotalBytes());
 }   
}
