package Statement13;
import java.util.Scanner;

class CountingThreads implements Runnable{
    int start;
    int end;
    String name;

    public void run(){
        for(int i = start; i < end; i++){
            //System.out.println(Thread.currentThread().getName() + " counts: " + i);
        }
        System.out.println(name + " completed its work.");
    }
}


public class Statement13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter total numbers to count: ");
        int nums = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter number of threads: ");
        int numThreads = sc.nextInt();
        sc.nextLine();

        CountingThreads[] threads = new CountingThreads[numThreads];
        
        int span = nums/ numThreads;
        int end  = span;
        int start = 1;

        for(int i = 0; i < numThreads; i++){

            threads[i] = new CountingThreads();
            threads[i].start = start;
            threads[i].end = end;
            threads[i].name = "Thread " + i;
            end += span;
            threads[i].run();
        }   
    }
}
