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
    public DownloadFile(){
        this.status = new DownloadStatus();
    }

    //Getter
    public DownloadStatus getStatus() {
        return status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file " + Thread.currentThread().getName());
        for (int i = 0; i < 10000; i++) {
            status.incrementTotalBytes();   
        }
    }
}


public class Confinement {
 public static void main(String[] args) {

    List<Thread> threads = new ArrayList<>();
    List<DownloadFile> tasks = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
        var task = new DownloadFile();
        tasks.add(task);
        var thread = new Thread(task);

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
    
    System.out.println(    
        tasks.stream()
        .map((DownloadFile task) -> task.getStatus().getTotalBytes())
        .reduce(Integer::sum)
    );


 }   
}
