package Statement16;
class Vehicle{
    protected String regnNumber, color, ownerName;
    protected int speed;

    Vehicle(String regNumber, String color, String owner, int speed){
        this.regnNumber = regNumber;
        this.color = color;
        this.ownerName = owner;
        this.speed = speed;
    }

    void showData(){
        System.out.println("This is vehicle class : ");
        System.out.println("RegNo: " + regnNumber + "; Color: " + color + "; Owner: " + ownerName + "; Speed: " + speed);
    
    }
}

class Bus extends Vehicle{
    private int routeNumber;

    Bus(String regNumber, String color, String ownerName, int speed, int routeNumber){
        super(regNumber,color, ownerName, speed);
        this.routeNumber = routeNumber;
    }

    void showData(){
        super.showData();
        System.out.println("Route Number: " + this.routeNumber);
    }
}

class Car extends Vehicle{
    private String manufacturerName;

    Car(String regNumber, String color, String ownerName, int speed, String manufacturerName){
        super(regNumber,color, ownerName, speed);
        this.manufacturerName = manufacturerName;
    }

    void showData(){
        super.showData();
        System.out.println("Manufacturer Name: " + this.manufacturerName);
    }
}

public class Statement16{
    public static void main(String[] args) {
        Car car = new Car("1236232723632","matte black", "Kiyazaki", 400, "Ferrari");
        car.showData();
    }    
}