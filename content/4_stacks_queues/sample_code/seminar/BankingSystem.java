// Main class to test the banking system
import java.io.*;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234", 100.0);
        BankAccount account2 = new BankAccount("4321", 500.0);
        
        Customer customer1 = new Customer("Batman", account1);
        Customer customer2 = new Customer("Iron Man", account2);

        // write your code here
    }
}