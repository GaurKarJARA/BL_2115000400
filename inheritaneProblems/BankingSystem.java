class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}
class CheckingAccount extends BankAccount {
    private double withdrawLimit;
    
    public CheckingAccount(String accountNumber, double balance, double withdrawLimit) {
        super(accountNumber, balance);
        this.withdrawLimit = withdrawLimit;
    }
    
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        super.displayInfo();
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        super.displayInfo();
    }
}
class FixedDepositAccount extends BankAccount {
    private int durationInMonths;
    public FixedDepositAccount(String accountNumber, double balance, int durationInMonths) {
        super(accountNumber, balance);
        this.durationInMonths = durationInMonths;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        super.displayInfo();
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("1383", 156743, 0.15);
        savingsAccount.displayAccountType();

        CheckingAccount checkingAccount = new CheckingAccount("439841", 1500, 1000);
        checkingAccount.displayAccountType();

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("3234232", 3000, 12);
        fixedDepositAccount.displayAccountType();
    }
}