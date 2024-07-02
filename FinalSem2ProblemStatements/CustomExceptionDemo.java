import java.util.Scanner;

// Custom exception class
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    // Method to check if the number is odd and throw the custom exception
    public static void checkNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        try {
            checkNumber(number);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
