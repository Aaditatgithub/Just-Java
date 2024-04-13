import java.util.Arrays;
import java.util.Scanner;

public class Statement6 {
    public static void main(String[] args) {
        //Armstrong

        int x = 153;
        int temp = x;
        int isArmstrong = 0;
        while(temp != 0){
            isArmstrong += Math.pow(temp%10, 3);
            temp /= 10;
        }
        if(isArmstrong == x){
            System.out.println("Armstrong");
        }


        //Anagram
        String a1 = "RACE";
        String a2 = "CARE";

        char[] c1 = a1.toCharArray();
        char[] c2 = a2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }


        //Dates

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date 1: (format:: YYYY-MM-DD): ");
        String Birthdate1 = sc.nextLine();
        System.out.println("Enter date 2: (format:: YYYY-MM-DD): ");
        String Birthdate2 = sc.nextLine();

        String[] date1 = Birthdate1.split("-");
        String[] date2 = Birthdate2.split("-");

        int year1 = Integer.parseInt(date1[0]);
        int month1 = Integer.parseInt(date1[1]);
        int day1 = Integer.parseInt(date1[2]);

        int year2 = Integer.parseInt(date2[0]);
        int month2 = Integer.parseInt(date2[1]);
        int day2 = Integer.parseInt(date2[2]);


        if(year1 > year2){
            System.out.println("DOB1 is younger");
        } else if( year1 < year2){
            System.out.println("DOB1 is older");
        }else{
            if(month1 > month2){
                System.out.println("DOB1 is younger");
            }
            else if(month1 < month2){
                System.out.println("DOB1 is older");
            }
            else{
                if(day1 > day2){
                    System.out.println("DOB1 is younger");
                }else if(day1 < day2){
                    System.out.println("DOB1 is older");
                }
                else{
                    System.out.println("Same age");
                }
            }
        }
    }
}
