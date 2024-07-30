

record Crane(String name, int numberOfEggs){

    //Compact constructor: do the stuff needed
    // public Crane{
    //     if(numberOfEggs < 0) {throw new IllegalArgumentException();}
       
    //     //Transform parameters the way you want
    //     name = name.toUpperCase();
    // }

    //Overloaded Constructor
    public Crane (String firstname, String lastname){
        this(firstname + " " + lastname, 0);
    }

}


public class Records {
    public static void main(String[] args) {
        Crane cranny = new Crane("harish", "chandra");
        System.out.println(cranny.numberOfEggs());
    }
}
