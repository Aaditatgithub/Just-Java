class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}


class BankAccount{
    Long accountNumber;
    Integer balance;

    BankAccount(Long accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount) throws Exception{
        
        if(amount > balance){
            throw new InsufficientFundsException("Withdrawal amount is greater than the balance");
        }
        else{
            balance -= amount;
        }
        
    }

    void displayBalance(){
        System.out.println("Balance is: " + balance);
    }
    
}

public class Statement4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12423l,300);
        account.deposit(100);
        account.displayBalance();
        
        try{
            account.withdraw(300);
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        finally{
            account.displayBalance();
        }

    }
}
