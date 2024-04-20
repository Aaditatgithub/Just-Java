
class DownloadStatus {
    private volatile boolean isDone;
    private int totalBytes;
    private int totalFiles;
    private final Object totalBytesLock = new Object();

    public int getTotalBytes() {
        synchronized (totalBytesLock) {
            return totalBytes;
        }
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone() {
        this.isDone = true;
    }

    public void incrementTotalFiles() {
        synchronized (this) {
            totalFiles++;
        }
    }

    public void incrementTotalBytes() {
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }
}


class DownloadFileTask implements Runnable {
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file " + Thread.currentThread().getName());
        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            status.incrementTotalBytes();
        }
        status.setIsDone();
        status.incrementTotalFiles(); // Increment total files when download is done

        synchronized(status){
            status.notifyAll();
        }
        
        System.out.println("Download Complete " + Thread.currentThread().getName());
    }
}

public class ThreadSignaling {
    public static void main(String[] args) {
        var status  = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status)); 
        var thread2 = new Thread(() -> {
            synchronized (status){
                while(status.getIsDone()){
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }}
        });

        thread1.start();
        thread2.start();
    }
}
