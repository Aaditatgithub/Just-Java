//class Mythread1 extends Thread{
//    @Override
//    public void run(){
//        while (true) {
//            System.out.println("My thread1 is running...");
//        }
//    }
//}
//
//class Mythread2 extends Thread{
//    @Override
//    public void run(){
//        while (true) {
//            System.out.println("My thread2 is running...");
//        }
//    }
//}
//
//class MyThreadRunnable1 implements Runnable{
//    public MyThreadRunnable1(String name){
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println("I am thread 1 not threat 1");
//    }
//}
//
//class MyThreadRunnable2 implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("I am thread 2 not threat 2");
//    }
//}
//
//public class Multithreading {
//    public static void main(String[] args) {
////        Mythread1 t1 = new Mythread1();
////        Mythread2 t2 = new Mythread2();
////        t1.start();
////        t2.start();
//
//        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
//        Thread gun1 = new Thread(bullet1);
//
//        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
//        Thread gun2 = new Thread(bullet2);
//
//        gun1.start();
//        gun2.start();
//
//    }
//}

public class Multithreading {
    public static void main(String[] args) {
        // Create a thread with a specified name using a constructor
        Thread namedThread = new Thread(new MyRunnable(), "Dhaage");

        // Start the thread
        namedThread.start();

        // Main thread continues its work
        System.out.println("Main thread is doing something else.");

        // You can also get the name of the thread
        System.out.println("Main thread name: " + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in the new thread
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
    }
}
