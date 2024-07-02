// Account interface
interface Account {
    void setAccountDetails(int accountNumber, double balance);
    void displayAccountDetails();
}

// Person interface
interface Person {
    void storePersonDetails(String name);
    void displayPersonDetails();
}

// Customer class implementing both Account and Person interfaces
class Customer implements Account, Person {
    private String name;
    private int accountNumber;
    private double balance;
    private static final double INTEREST_RATE = 0.05; // Example interest rate

    // Implementing store() method from Person interface
    @Override
    public void storePersonDetails(String name) {
        this.name = name;
    }

    // Implementing disp() method from Person interface
    @Override
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
    }

    // Implementing set() method from Account interface
    @Override
    public void setAccountDetails(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Implementing display() method from Account interface
    @Override
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        double interest = balance * INTEREST_RATE;
        System.out.println("Interest: $" + interest);
    }

    // Method to display all information
    public void displayAllDetails() {
        displayPersonDetails();
        displayAccountDetails();
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        // Creating a Customer object
        Customer customer = new Customer();

        // Setting and storing details
        customer.storePersonDetails("John Doe");
        customer.setAccountDetails(123456, 1000.0);

        // Displaying all details
        customer.displayAllDetails();
    }
}
