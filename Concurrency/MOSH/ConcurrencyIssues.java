import java.util.ArrayList;
import java.util.List;

class DownloadStatus {
    private int totalBytes = 0;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes(){
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


public class ConcurrencyIssues {
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
