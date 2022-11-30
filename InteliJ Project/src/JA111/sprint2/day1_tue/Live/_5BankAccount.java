package JA111.sprint2.day1_tue.Live;

public class _5BankAccount {
    String customerName;
    static String bankName;
    Double balance;
    public static void main(String[] args) {
        _5BankAccount.bankName="SBI";
        _5BankAccount acc1=new _5BankAccount();
        acc1.customerName="Sudhanshu Roy";
        acc1.balance=500000000.00;

        _5BankAccount acc2=new _5BankAccount();
        acc2.customerName="Sonu Roy";
        acc2.balance=5000000000.94338;

    }
}
