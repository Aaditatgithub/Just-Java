// package 0-Scenarios;

public class Calculator {
    
    public static long add(int ...arr){
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double divide(double a, double b) throws IllegalArgumentException{
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            return a / b;
        }
    }
    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(subtract(10, 5));
        System.out.println(multiply(10, 5));
        System.out.println(divide(10, 0));  
    }
}
