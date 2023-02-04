public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount();
        BankAccount account5 = new BankAccount();
        BankAccount account6 = new BankAccount();

        account1.deposit(1, 50.00);
        System.out.println(account1.getSavingsBalance());

        account1.deposit(0, 400.00);
        System.out.println(account1.getCheckingBalance());

        System.out.println(account1.getBothBalance());

        account1.withdraw(0, 450.00);
        account1.withdraw(0, 400.00);
        System.out.println(account1.getCheckingBalance());

        System.out.println(account1.getAccountNumber());
        System.out.println(account2.getAccountNumber());
        System.out.println(account3.getAccountNumber());
        System.out.println(account4.getAccountNumber());
        System.out.println(account5.getAccountNumber());
        System.out.println(account6.getAccountNumber());
    }
}