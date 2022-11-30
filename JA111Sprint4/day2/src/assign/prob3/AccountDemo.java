package assign.prob3;

public class AccountDemo {
    public static void main(String [] s){
Account account=new Account();
System.out.println(account.balance);
account.deposit(10000);
System.out.println(account.balance);
try{
    System.out.println(account.withdraw(4500));
    System.out.println(account.balance);
    System.out.println(account.withdraw(10000));
}
catch (InsufficientFundsException exception){
    System.out.println(exception.getMessage());
}

    }
}
