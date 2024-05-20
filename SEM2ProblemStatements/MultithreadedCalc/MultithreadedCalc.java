package MultithreadedCalc;
import java.util.Scanner;

public class MultithreadedCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        double num1 = sc.nextDouble(); sc.nextLine();
        
        System.out.println("Enter number 2: ");
        double num2 = sc.nextDouble(); sc.nextLine();

        Thread addThread = new Thread(() -> {
            synchronized(MultithreadedCalc.class) {
                try {
                    MultithreadedCalc.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Addition is: " + (num1 + num2));
            }
        });

        Thread subThread = new Thread(() -> {
            synchronized(MultithreadedCalc.class) {
                try {
                    MultithreadedCalc.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Subtraction is: " + (num1 - num2));
            }
        });

        Thread multThread = new Thread(() -> {
            synchronized(MultithreadedCalc.class) {
                try {
                    MultithreadedCalc.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Multiplication is: " + (num1 * num2));
            }
        });

        Thread divThread = new Thread(() -> {
            synchronized(MultithreadedCalc.class) {
                try {
                    MultithreadedCalc.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Division is: " + (num1 / num2));
            }
        });

        System.out.println("Enter choice: ");
        int choice = sc.nextInt(); sc.nextLine();

        switch (choice) {
            case 1:
                addThread.start();
                synchronized(MultithreadedCalc.class) {
                    MultithreadedCalc.class.notify();
                }
                break;
            case 2:
                subThread.start();
                synchronized(MultithreadedCalc.class) {
                    MultithreadedCalc.class.notify();
                }
                break;
            case 3:
                multThread.start();
                synchronized(MultithreadedCalc.class) {
                    MultithreadedCalc.class.notify();
                }
                break;
            case 4:
                divThread.start();
                synchronized(MultithreadedCalc.class) {
                    MultithreadedCalc.class.notify();
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
