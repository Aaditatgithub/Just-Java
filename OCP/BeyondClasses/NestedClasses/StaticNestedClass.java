class Park{
    static class Ride{
        int price = 10;
    }
}

//Instantiation outside the class is slightly different than the inner class
public class StaticNestedClass {
    public static void main(String[] args) {
        Park.Ride ride = new Park.Ride(); // Correct instantiation syntax
        System.out.println(ride.price);
    }
}
