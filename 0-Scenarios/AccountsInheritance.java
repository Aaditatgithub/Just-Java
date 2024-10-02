import java.math.BigDecimal;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount{
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
}

class SavingsAccount extends BankAccount {
    private Float interestRateFloat;
    
    public SavingsAccount(String accountNumber, String ownerName, BigDecimal balance, Float interestRateFloat) {
        super(accountNumber, ownerName, balance);
        this.interestRateFloat = interestRateFloat;
    }

    public void addInterest() {
        this.balance = this.balance.add(this.balance.multiply(BigDecimal.valueOf(this.interestRateFloat)));
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + this.interestRateFloat);
    }
}

class CheckingAccount extends BankAccount{
    private BigDecimal overdraftLimit;
    public CheckingAccount(Stirng accountNumber, String ownerName, BigDecimal balance, BigDecimal overdraftLimit) {    
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(BigDecimal amount) throws InsufficientFundsException {
        if (amount.compareTo(this.overdraftLimit) > 0) {
            throw new InsufficientFundsException("Overdraft limit exceeded");
        } else {
            super.withdraw(amount);
        }
    }
    
    public void checkOverdraftAvailability(BigDecimal amount){
        BigDecimal available = this.balance.add(this.overdraftLimit).subtract(amount);
        if(available.compareTo(BigDecimal.ZERO) < 0){
            System.out.println("Overdraft limit exceeded");
        }
        else{
            System.out.println("Overdraft available");
        }
    }
}

public class AccountsInheritance {
    public static void main(String[] args) {
        try {
            // Create a savings account
            SavingsAccount savings = new SavingsAccount("S123456", "Alice", new BigDecimal("2000.00"), new BigDecimal("0.03"));
            savings.displayAccountDetails();
            savings.deposit(new BigDecimal("500.00"));
            savings.applyInterest();
            savings.displayAccountDetails();

            // Create a checking account
            CheckingAccount checking = new CheckingAccount("C123456", "Bob", new BigDecimal("1000.00"), new BigDecimal("500.00"));
            checking.displayAccountDetails();
            checking.deposit(new BigDecimal("200.00"));
            checking.withdraw(new BigDecimal("1200.00"));
            checking.checkOverdraftAvailability(new BigDecimal("1000.00"));
            checking.displayAccountDetails();
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
