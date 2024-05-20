package ValidMail;
class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}

public class InvalidEmail {

    public static void checkMail(String mailId)throws InvalidEmailException{
        String[] checking = mailId.split("@");
        if(mailId == null || mailId.indexOf("@") == -1 || mailId.indexOf(".") == -1 || mailId.indexOf("@") > mailId.indexOf(".")){
            throw new InvalidEmailException("Invalid Email Address.");
        } 
        return;
    }

    public static void main(String[] args) {
        try {
            checkMail("11.patilaaditya@gmail.com");
            System.out.println("Valid email address.");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getLocalizedMessage());
        }
    }
}
