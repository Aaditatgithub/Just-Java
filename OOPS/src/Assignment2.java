//Swapping numbers

public class Assignment2 {
//    static void swap(AtomicInteger a, AtomicInteger b) {
//        int temp = a.get();
//        a.set(b.get());
//        b.set(temp);
//    }

    public static void main(String[] args) {
//        AtomicInteger a = new AtomicInteger(16);
//        AtomicInteger b = new AtomicInteger(20);
//
//        System.out.println("Before swapping: " + a + "," + b);
//        swap(a, b);
//        System.out.println("After swapping: " + a + "," + b);

        int a = 10;
        int b = 54;
        if(a > b){
            a = a-b;
            b = a+b;
            a = b-a;
        }
        else {
            b = b - a;
            a = b + a;
            b = a - b;
        }
    }
}
