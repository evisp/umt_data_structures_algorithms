// Main class to test the banking system
import java.io.*;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", 500.0);
        BankAccount account2 = new BankAccount("987654321", 300.0);
        
        Customer customer1 = new Customer("Alice", account1);
        Customer customer2 = new Customer("Bob", account2);
        
        account1.deposit(200);
        account1.withdraw(100);
        account1.getLastTransaction();
        account1.printTransactionHistory();
        
        BankAccount.transferFunds(account1, account2, 150);
        account1.printTransactionHistory();
        account2.printTransactionHistory();
        
        BankQueue bankQueue = new BankQueue();
        bankQueue.addCustomerToQueue(customer1);
        bankQueue.addCustomerToQueue(customer2);
        bankQueue.printQueue();
        
        bankQueue.serveCustomer();
        bankQueue.serveCustomer();
        bankQueue.serveCustomer(); 
    }
}