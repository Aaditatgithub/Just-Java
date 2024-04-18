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

public class PausingAThread {
    public static void main(String[] args) {
        for(int i = 0; i < 9; i++){
            new Thread(new DownloadFile()).start();
        }
    }   
}
