import java.util.Scanner;

public class Statement9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texString = sc.nextLine();
        boolean hasVowels = false;

        char[] str = texString.toCharArray();

        for(char c : str){
            if("AEIOUaeiou".indexOf(c) != -1){
                System.out.println("String has vowels");
                hasVowels = true;
                break;
            }
        }

        if(hasVowels == false){
            System.out.println("String doesnt has vowels ");
        }
    }
}