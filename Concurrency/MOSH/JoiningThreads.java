class DownloadFile implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading a file " + Thread.currentThread().getName());
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download Complete");
    }
}

public class JoiningThreads {
    public static void main(String[] args) {
        Thread downloadThread = new Thread(new DownloadFile());
        downloadThread.start();

        try {
            downloadThread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("File is ready to be scanned");
    }
}
