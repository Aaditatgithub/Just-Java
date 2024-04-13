import java.util.Arrays;
import java.util.Scanner;

public class Statement3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        
        int sizeArray = sc.nextInt();
        int[] Array = new int[sizeArray];

        System.out.println("Enter the array: ");


        for(int i = 0; i < sizeArray; i++){
            Array[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i : Array){
            sum += i;
        }
        
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + sum/sizeArray);
        //display mix and max

        //returns index of element
        System.out.println(Arrays.binarySearch(Array, 12));

        
    }
}
