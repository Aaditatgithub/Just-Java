public class Statement16 {
    public static void main(String[] args) {
        String str = new String("Yoroshiku");
        for(int i = 0; i < str.length(); i++){
            if("AIEOUaeiou".indexOf(str.charAt(i)) == -1){
                System.out.println("Not all members are vowels.");
                break;
            }
        }
    }   
}
