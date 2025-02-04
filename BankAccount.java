import java.util.*;
class BankAccount {
    private static String bankName = "SBI";
    private String accountHolderName;
    private final long accountNumber;
    private static int totalAccounts;
    BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = (long) (Math.random() * Math.pow(10,12));
        totalAccounts++;
    }
    static int getTotalAccounts() {
       return totalAccounts;
    }
    void displayAccountInfo() {
        System.out.println("Bank Details: ");
        System.out.println("Bank Name: " +  bankName);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
    }

    public static void main(String []args) {
        BankAccount account = new BankAccount("gaurav");
        System.out.print(BankAccount.getTotalAccounts());
        if (account instanceof BankAccount){
            System.out.print("\naccount is instance of BankAccount!!\n");
            account.displayAccountInfo();
        }
    }
}



