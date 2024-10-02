import java.math.BigDecimal;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankAccount {
    private final String accountNumber;
    private String ownerName;
    private BigDecimal balance;

    // Constructor
    public BankAccount(String accountNumber, String ownerName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Deposit money into the account
    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = this.balance.add(amount);
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money from the account
    public void withdraw(BigDecimal amount) throws InsufficientFundsException {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount.compareTo(this.balance) > 0) {
            throw new InsufficientFundsException("Insufficient funds");
        } else {
            this.balance = this.balance.subtract(amount);
            System.out.println("Withdrew: " + amount);
        }
    }

    // Check balance
    public BigDecimal getBalance() {
        return this.balance;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Balance: " + this.balance);
    }

    public static void main(String[] args) {
        try( BankAccount account = new BankAccount("123456", "John Doe", new BigDecimal("1000.00"));) {
            // Display account details
            account.displayAccountDetails();

            // Perform transactions
            account.deposit(new BigDecimal("500.00"));
            account.withdraw(new BigDecimal("200.00"));

            // Display updated account details
            account.displayAccountDetails();
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
