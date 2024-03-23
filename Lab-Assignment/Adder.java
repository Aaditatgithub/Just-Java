import java.util.Arrays;
import java.util.Scanner;

public class Adder {
    private int[] dataArray;
    private int targetSum;

    public Adder() {
        targetSum = 0;
    }

    public void getdata() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        dataArray = new int[size];

        System.out.println("Enter distinct integers for the array:");
        for (int i = 0; i < size; ++i) {
            dataArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        targetSum = scanner.nextInt();
    }

    public int[] numsum() {
        int[] result = new int[2];

        for (int i = 0; i < dataArray.length; ++i) {
            for (int j = i + 1; j < dataArray.length; ++j) {
                if (dataArray[i] + dataArray[j] == targetSum) {
                    result[0] = dataArray[i];
                    result[1] = dataArray[j];
                    return result;
                }
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        Adder myAdder = new Adder();
        myAdder.getdata();
        int[] result = myAdder.numsum();
        System.out.println(Arrays.toString(result));
    }
}
