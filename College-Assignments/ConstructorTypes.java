class Human{
    private String name;
    private int age;

    //constructor overloading 

    Human() {}      // default constructor
    
    Human(int age){             //Parameterized Constructor
        this.age = age;
        this.name = "Anamika";
    }

    Human(int age, String name){    //Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    Human(Human h){
        this.age = h.age;
        this.name = h.name;
    }

    //Getters
    public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }

}

public class ConstructorTypes {
    public static void main(String[] args) {
        Human indian = new Human(23);
        Human russian = new Human();            // If values are called they would be default ie. null or 0 or false
        Human maharashtrian = new Human(indian);    // Deep copy of indian object

        System.out.println(indian.getAge());
        System.out.println(indian.getName());

        System.out.println(russian.getAge());
        System.out.println(russian.getName());

        System.out.println(maharashtrian.getAge());
        System.out.println(maharashtrian.getName());

    }
}
