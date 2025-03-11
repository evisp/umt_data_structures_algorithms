// BankAccount class with transaction stack
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private Stack<Transaction> transactionHistory;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new Stack<>();
    }
    
    public void deposit(double amount) {
        // write your code here
    }
    
    public void withdraw(double amount) {
        // write your code here
    }
    
    public static void transferFunds(BankAccount from, BankAccount to, double amount) {
        // write your code here
    }
    
    public void getLastTransaction() {
        // write your code here
    }
    
    public void printTransactionHistory() {
        // write your code here
    }
    
    private void saveTransactionToCSV(Transaction transaction) {
        try (FileWriter writer = new FileWriter("transactions.csv", true)) {
            writer.write(transaction.toCSV() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving transaction to CSV: " + e.getMessage());
        }
    }
}