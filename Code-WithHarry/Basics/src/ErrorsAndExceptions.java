class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative.";
    }

    @Override
    public String getMessage(){
        return "Ensure your radius is positive";
    }
}

public class ErrorsAndExceptions {
    public static double C_area(int r) throws NegativeRadiusException {
        if(r < 0){
            throw new NegativeRadiusException();
        }
        return Math.PI*r*r;
    }

    public static void main(String[] args) {
        // Try catch block
//        int a = 100;
//        int b = 0;
//        try{
//            int c = a/2;
//            System.out.println("The result is " + c);
//        }
//        catch(Exception e){
//            System.out.println("Division failed :: Reason :: ");
//            System.out.println(e);
//        }

        try{
            double res = C_area(-5);
            System.out.println("The area is "+res);
        }
        catch(Exception e){
            System.out.println("Error is : " + e);
        }
        finally{
            System.out.println("This is the end of program");
        }
    }
}
