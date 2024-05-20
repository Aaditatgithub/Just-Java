import java.util.ArrayList;
import java.util.List;

interface Account{
    void deposit(int amount);
    int withdraw(int amount);
    void calculateInterest();
    void viewBalance();
}

class Bank{
    List<Account> accounts;

    Bank(){
        accounts = new ArrayList<>();
    }

    void addAccounts(Account newAccount){
        accounts.add(newAccount);
    }
}

class SavingsAccount implements Account{

}

class CurrentAccount implements Account{
    int balance;
    int overdraftLimit;
}

public class Statement14 {
    public static void main(String[] args) {
        
    }
}
