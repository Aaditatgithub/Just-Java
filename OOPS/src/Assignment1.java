// Program for calculator

public class Assignment1{
    static int addition(int ...numbers){
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    static int subtraction(int ...numbers){
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum -= numbers[i];
        }
        return sum;
    }

    static int multiplication(int ...numbers){
        int mult = 1;
        for (int i = 0; i < numbers.length; i++) {
            mult *= numbers[i];
        }
        return mult;
    }

    static int division(int ...numbers){
        int div = 1;
        for (int i = 0; i < numbers.length; i++) {
            div /= numbers[i];
        }
        return div;
    }

    public static void main(String[] args) {
        System.out.println(addition(1,3,134,786));
        System.out.println(subtraction(1,3,134,786));
        System.out.println(multiplication(1,3,134,786));
        System.out.println(division(1,3,134,786));
    }
}