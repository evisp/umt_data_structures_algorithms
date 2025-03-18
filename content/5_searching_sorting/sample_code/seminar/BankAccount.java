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

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void deposit(double amount) {
        balance += amount;
        Transaction t = new Transaction(Transaction.Type.DEPOSIT, amount, "Deposited to account " + accountNumber);
        transactionHistory.push(t);
        saveTransactionToCSV(t);
    }

    protected void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        balance -= amount;
        Transaction t = new Transaction(Transaction.Type.WITHDRAW, amount, "Withdrawn from account " + accountNumber);
        transactionHistory.push(t);
        saveTransactionToCSV(t);
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
