package ClassDesign;

// 1. Mark the class as final or make all of the constructors private.
// 2. Mark all the instance variables private and final.
// 3. Don’t define any setter methods.
// 4. Don’t allow referenced mutable objects to be modified.
// 5. Use a constructor to set all properties of the object, making a copy if needed

final class Person {
    private final String name;
    private final int age;
    private final Address address;

    // Constructor to initialize immutable fields
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        // Perform defensive copy for mutable field (Address)
        this.address = new Address(address.getStreet(), address.getCity());
    }

    // Getter methods for immutable fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Defensive copy for mutable field (Address)
    public Address getAddress() {
        return new Address(address.getStreet(), address.getCity());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

// Address class with mutable fields
class Address {
    private final String street;
    private final String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class ImmutableClasses {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Cityville");
        Person person = new Person("John", 30, address);

        // Print the person object to demonstrate immutability
        System.out.println(person);

        // Print the address of the person to demonstrate defensive copying
        System.out.println(person.getAddress());
    }
}

