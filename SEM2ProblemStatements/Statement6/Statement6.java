package Statement6;

class Calculator{
    static double PI;

    static {
        System.out.println("Calculator class loaded in memory.");
        PI = Math.PI;
    }
    {
        System.out.println("New Calculator Instance.");
    }

    void addition(float a, float b){
        System.out.println("Result: " + (a+b));
    }
    void subtraction(float a, float b){
        System.out.println("Result: " + (a-b));
    }
    void multiplication(float a, float b){
        System.out.println("Result: " + (a*b));
    }
    void division(float a, float b){
        if(b == 0){ System.out.println("Denominator cannot be zero!"); return;}
        System.out.println("Result: " + (a/b));
    }
}

public class Statement6 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.addition(1, 2);
    }
}
