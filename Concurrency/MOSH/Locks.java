import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DownloadStatus {
    private int totalBytes;
    private Lock lock = new ReentrantLock();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes(){
        lock.lock();
        try{
            totalBytes++;
        }
        finally{    
            // in complex logic, if something happens, while cleanup, access to resource can be unlocked
            lock.unlock();
        }
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


public class Locks {
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
