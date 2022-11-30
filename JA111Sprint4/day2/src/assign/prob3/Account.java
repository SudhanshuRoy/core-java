package assign.prob3;

public class Account {
    String accountNumber;
    double balance;
    void deposit(double amount){
       balance+=amount;
    }
    double withdraw(double amount) throws InsufficientFundsException{
       if(balance>amount){
           balance-=amount;
           return amount;
       }else {
           throw new InsufficientFundsException("You account don't have sufficient amount");
       }
    }
}
