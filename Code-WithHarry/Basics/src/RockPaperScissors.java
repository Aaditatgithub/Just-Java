import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
//        int comp_guess = rand.nextInt(3);
//        System.out.println(comp_guess);


//        int[] rolls = new int[4];
//        rolls[0] = 10;
//        rolls[1] = 10;
//        rolls[2] = 10;
//        rolls[3] = 10;
//
//        for(int i : rolls){
//            System.out.print(i + " ");
//        }

        int [][] arr = new int[2][3];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

            
    }
}
