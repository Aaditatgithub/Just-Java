package Statement8;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Statement8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");

        int[] array = new int[sc.nextInt()];
        sc.nextLine();
        System.out.println("Enter elements of array");
        
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();    
        }
        sc.nextLine();

        //Addition
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Addition:: " + sum);

        System.out.println(Arrays.stream(array).max().getAsInt());
        System.out.println(Arrays.stream(array).min().getAsInt());
        
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}