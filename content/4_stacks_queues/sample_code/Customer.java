// Customer class representing bank clients
public class Customer {
    private String name;
    private BankAccount bankAccount;

    public Customer(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void printAccountDetails() {
        System.out.println("Customer: " + name);
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: $" + bankAccount.getBalance());
    }
}
