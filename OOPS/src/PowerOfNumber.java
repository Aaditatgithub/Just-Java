import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = calculatePowerWithoutFunction(base, exponent);

        System.out.println(base + " ^ " + exponent + " = " + result);

        scanner.close();
    }
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.print("Enter the base: ");
    //     double base = scanner.nextDouble();

    //     System.out.print("Enter the exponent: ");
    //     int exponent = scanner.nextInt();

    //     double result = Math.pow(base, exponent);

    //     System.out.println(base + " ^ " + exponent + " = " + result);

    //     scanner.close();
    // }

    private static double calculatePowerWithoutFunction(double base, int exponent) {
        double result = 1;

        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }

        return exponent < 0 ? 1 / result : result;
    }
}
