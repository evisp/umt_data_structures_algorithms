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
        balance += amount;
        
        Transaction t = new Transaction(
        		Transaction.Type.DEPOSIT, 
        		amount, 
        		"Deposited to account " 
        		+ accountNumber);
        transactionHistory.push(t);
        
        saveTransactionToCSV(t);
        
        System.out.println("Deposited: $" + amount);
    }
    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        balance -= amount;
        Transaction t = new Transaction(Transaction.Type.WITHDRAW, amount, "Withdrawn from account " + accountNumber);
        transactionHistory.push(t);
        saveTransactionToCSV(t);
        System.out.println("Withdrawn: $" + amount);
    }
    
    public static void transferFunds(BankAccount from, BankAccount to, double amount) {
        if (amount > from.balance) {
            System.out.println("Insufficient funds for transfer!");
            return;
        }
        from.balance -= amount;
        to.balance += amount;
        Transaction t = new Transaction(Transaction.Type.TRANSFER, amount, "Transfer from " + from.accountNumber + " to " + to.accountNumber);
        from.transactionHistory.push(t);
        to.transactionHistory.push(t);
        from.saveTransactionToCSV(t);
        to.saveTransactionToCSV(t);
        System.out.println("Transferred $" + amount + " from " + from.accountNumber + " to " + to.accountNumber);
    }
    
    public void getLastTransaction() {
        if (!transactionHistory.isEmpty()) {
            System.out.println("Last Transaction: " + transactionHistory.peek());
        } else {
            System.out.println("No transactions yet.");
        }
    }
    
    public void printTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transaction history available.");
            return;
        }
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }
    }
    
    private void saveTransactionToCSV(Transaction transaction) {
        try (FileWriter writer = new FileWriter("transactions.csv", true)) {
            writer.write(transaction.toCSV() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving transaction to CSV: " + e.getMessage());
        }
    }
}