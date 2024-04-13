public class Demo{
    public static void main(String[] args) {
        Runnable possiblyWouldRun = () -> {
            System.out.println(
                "Hello from lambda"
            );
        };

        Thread worker = new Thread(possiblyWouldRun);
        worker.start();
    }
}