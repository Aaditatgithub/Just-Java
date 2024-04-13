class NoVowelsFoundException extends Exception{
    public NoVowelsFoundException(String message){
        super(message);
    }
}

public class Statement9 {

    static boolean checkForVowels (String str) throws NoVowelsFoundException{
        boolean containsVowels = false;
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                containsVowels = true;
                break;
            }
        }
        if (!containsVowels) {
            throw new NoVowelsFoundException("String does not contain any vowels");
        }
        return containsVowels;
    } 

    public static void main(String[] args) {
        String sentence = "Yoro";
        
        try{
            checkForVowels(sentence);
            System.out.println("String contains vowels");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
