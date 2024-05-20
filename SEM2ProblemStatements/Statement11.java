import java.util.ArrayList;
import java.util.List;

interface BankingAccount{
    void createAccount(double initialDeposit, String accountNumber);
    void deposit(double deposit);
    void withdraw(double amount);
    void transferFunds(BankingAccount reciever, double transferAmount);
    List<String> viewTransactions();
}

abstract class BankAccount implements BankingAccount{
    protected String accountNumber;
    protected double accountBalance;
    protected List<String> transactions;

    public BankAccount(double initialDeposit, String accountNumber){
        this.accountBalance = initialDeposit;
        this.accountNumber = accountNumber;
        this.transactions = new ArrayList<>();
        this.transactions.add("Account created with initial deposit of " + initialDeposit); 
    }

    @Override
    public void deposit(double deposit){
        accountBalance += deposit;
        transactions.add(deposit + " bucks deposited to the account");
    }

    @Override
    public void withdraw(double amount){
        if(amount > accountBalance){
            System.out.println("Insufficient funds");
            return;
        }
        else{
            accountBalance -= amount;
            transactions.add("Withdrawal of " + amount + " bucks was made.");
        }
        return;
    }

    @Override
    public void transferFunds(BankingAccount reciever, double transferAmount){
        if(accountBalance > transferAmount){
            accountBalance -= transferAmount;
            
        }
    }

} 

public class Statement11 {
    public static void main(String[] args) {
        
    }
}
