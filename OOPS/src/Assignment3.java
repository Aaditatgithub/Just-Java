//palindrome number
public class Assignment3 {
    static boolean check_palindrome(int num){
        int temp = num;
        int rev = 0;
        while(temp != 0) {
            rev = rev*10 + temp%10;
            temp /= 10;
        }
        if(rev == num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(check_palindrome(12322));
    }
}
