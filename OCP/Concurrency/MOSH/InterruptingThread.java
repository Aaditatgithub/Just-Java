class DownloadFile implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading a file " + Thread.currentThread().getName());
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if(Thread.currentThread().isInterrupted()) {return;}
            else{ System.out.println("Failed");}
            System.out.println("Downloading  " + i);
        }
        System.out.println("Download Complete");
    }
}

public class InterruptingThread {
    public static void main(String[] args) {
        Thread downloadThread = new Thread(new DownloadFile());
        downloadThread.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }

        //doesnt force the thread to stop, but sends a intr req to thread,
        // Its upto thread to stop or not.
        downloadThread.interrupt();
    }
}
