public class Demo2 {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            for(int i = 0;i < 1000; i++){
                System.out.println("iter" + i);
            }
        });
        
        worker.setDaemon(true);
        worker.start();

        for (int i = 0; i < 123; i++) {
            System.out.println("Main" + i);
        }
    }
}
