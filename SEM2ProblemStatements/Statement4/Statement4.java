package Statement4;
import java.util.Scanner;

class InvalidTemperatureException extends Exception{
    public InvalidTemperatureException(String message){
        super(message);
    }
}

class TemperatureConverter{
    public static void CelsiusToFarenheit(float celsius) throws InvalidTemperatureException{
        if(celsius < -273.15 || celsius > 1000){
            throw new InvalidTemperatureException("INVALID INPUT! :: Allowed Temperature Range: -273.15C - 1000C");
        }
        else{
           System.out.println("Temperature in Farhenheit: " + (9*celsius/5) + 32);
        }
    }
}

public class Statement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float temperature = sc.nextFloat();
        sc.nextLine();

        try{
            TemperatureConverter.CelsiusToFarenheit(temperature);
        }catch(InvalidTemperatureException e){
            System.out.println(e.getMessage());
        }
    }
}
