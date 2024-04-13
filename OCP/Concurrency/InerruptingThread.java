public class InerruptingThread {
    private static int counter;

    static {
        counter = 0;
    }

    public static void main(String[] args) {
        final var mainThread = Thread.currentThread();
        new Thread(() -> {
            try {
                for (int i = 0; i < 1000; i++) {
                    counter++;
                    System.out.println(counter);
                }
                mainThread.interrupt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        while(counter < 1000){
            try{
                Thread.sleep(1_000);
            }catch(Exception e){
                System.out.println("Interrupted");
            }
        }
    }
}
