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

class DownloadFile implements Runnable {
    private final DownloadStatus status;

    public DownloadFile(DownloadStatus status) {
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
        System.out.println("Download Complete " + Thread.currentThread().getName());
    }
}

public class VolatileKeyword {
    public static void main(String[] args) {
        DownloadStatus downloadStatus = new DownloadStatus();

        Thread thread1 = new Thread(new DownloadFile(downloadStatus));
        Thread thread2 = new Thread(() -> {
            while (!downloadStatus.getIsDone()) {
                // Busy wait is replaced with proper synchronization
                try {
                    Thread.sleep(100); // Adding a short delay to reduce CPU usage
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Total bytes downloaded: " + downloadStatus.getTotalBytes());
            System.out.println("Total files downloaded: " + downloadStatus.getTotalFiles());
        });

        thread1.start();
        thread2.start();
    }
}
