import java.util.Scanner;
import java.math.*;

//Armstrong number
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int to_be_arm = a;
        int arm = 0;
        while(a != 0){
            arm += (int)Math.pow(a%10,3);
            System.out.println(arm);
            a /= 10;
        }
        System.out.println(arm);
        if(arm == to_be_arm){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}
