import java.util.Scanner;

public class Statement2 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        System.out.println("Length of string: " + line.length());
        System.out.println("Lowercase String: " + line.toLowerCase());
        System.out.println("Uppercase String: " + line.toUpperCase());

        StringBuilder sb = new StringBuilder(line);
        StringBuilder sb_rev = new StringBuilder(line.length());
        for(int i = line.length() - 1; i >= 0 ; i++){
            sb_rev.append(sb.charAt(i));
        }

        if(sb == sb_rev){
            System.out.println("palindrome");
        }

        System.out.println("Character to be checked: ");
        char ch_searched = scanner.next().charAt(0);

        long count = line.chars().filter(ch -> ch == ch_searched).count();
        System.out.println("Occurences of " + ch_searched + ": " + count);

        sb.append("aadityasya namaskaram ye kuruvanti dine dine");
        System.out.println(sb);

    }
}
