import java.time.*;
import java.util.Scanner;
import java.lang.String;
public class TakingInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int input = sc.nextInt();

//        //fibonacci
//        int f0 = 0;
//        int f1 = 1;
//        int fn;
//        for(int i = 0; i < input; i++){
//            System.out.println(f0);
//            fn = f0 + f1;
//            f1 = f0;
//            f0 = fn;
//        }

//        if(sc.hasNextInt()){
//            System.out.println("You entered an integer");
//        }
//        else{
//            System.out.println("Not an integer");
//        }

//        String str = sc.nextLine();
//        System.out.println(str);

//        String name = sc.next();
//        System.out.println("Hello " + name + ", Yoroshiku!");

        Integer a = 12;
        System.out.println(a.toString() + 14);
        System.out.println(" ardha b c ".strip());

        String str = """
                     a
                      b
                     c""";
        System.out.println(str.length());
        System.out.println(str.indent(-4));
        System.out.println(str.indent(1).length());

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
    }
}
