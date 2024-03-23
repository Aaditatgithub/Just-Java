public class staticMethods {
    static int add(int x, int y){
        return (x + y);
    }
    static int add(int ...arr){
       int sum = 0;
        for(int i : arr){
            sum += i;
       }
        return sum;
    }

    //Recursion
    static int fibonacci(int n){
        if(n == 1 || n == 0) return n;
        return (fibonacci(n-1) + fibonacci(n-2));
    }
    public static void main(String[] args){
        //System.out.println(add(5,3,5,7,8,1));
        System.out.println(fibonacci(6));
    }
}
