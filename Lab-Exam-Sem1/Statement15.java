import java.util.ArrayList;
import java.util.List;

public class Statement15 {

    public static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num <= 3) return true;

        if(num%2 == 0 || num%3 == 0) return false;

        for(int i = 5; i*i < num; i += 6){
            if(num % i == 0 || num % (i + 2) == 0){
                return false;
            }
        }
        return true;    
    }

    public static ArrayList<Integer> findTwinPrimes(int limit) {
        ArrayList<Integer> twinPrimes = new ArrayList<>();

        for (int i = 2; i < limit; i++) {
            if (isPrime(i) && isPrime(i + 2) && !isPrime(i + 1)) {
                twinPrimes.add(i);
                twinPrimes.add(i + 2);
            }
        }
        return twinPrimes;
    }

    public static void main(String[] args) {
        int limit = 100;
        ArrayList<Integer> twinPrimes = findTwinPrimes(limit);

        System.out.println("Twin prime numbers less than " + limit + ":");
        for (int i = 0; i < twinPrimes.size(); i += 2) {
            System.out.println("(" + twinPrimes.get(i) + ", " + twinPrimes.get(i + 1) + ")");
        }
    }
}
