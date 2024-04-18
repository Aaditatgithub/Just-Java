class DownloadFile implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading a file " + Thread.currentThread().getName());
    }
}


public class StartingAThread {
    public static void main(String[] args) {
        //Runnable interface the task to be run on a thread, single method called run
        DownloadFile df = new DownloadFile();

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().threadId());
        Thread worker = new Thread(df);
        worker.start();

    }   
}
