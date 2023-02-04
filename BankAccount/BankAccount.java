import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;

    private static int totalAccounts = 0;
    private static double totalMoney = 0.0;

    public BankAccount() {
        this(0.0, 0.0);
    }

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = generateAccount();
        totalAccounts++;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public double getBothBalance() {
        return this.savingsBalance + this.checkingBalance;
    }

    public void deposit(int account, double amount) {
        switch (account) {
            case 0:
                this.checkingBalance += amount;
                break;
            case 1:
                this.savingsBalance += amount;
                break;
        }
        totalMoney += amount;
    }

    public void withdraw(int account, double amount) {
        switch (account) {
            case 0:
                if (this.checkingBalance - amount >= 0) {
                    this.checkingBalance -= amount;
                    totalMoney -= amount;
                } else {
                    System.out.println("Insufficient funds");
                }
                break;
            case 1:
                if (this.savingsBalance - amount >= 0) {
                    this.savingsBalance -= amount;
                    totalMoney -= amount;
                } else {
                    System.out.println("Insufficient funds");
                }
                break;
        }
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public static long generateAccount() {
        Random rand = new Random();
        long result = rand.nextLong(9999999999l - 1000000000l) + 1000000000l;
        return result;
    }
}