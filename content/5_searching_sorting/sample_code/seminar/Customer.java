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

    public void deposit(double amount) {
        bankAccount.deposit(amount);
        System.out.println(name + " deposited $" + amount);
    }

    public void withdraw(double amount) {
        bankAccount.withdraw(amount);
        System.out.println(name + " withdrew $" + amount);
    }

    public void transferTo(Customer recipient, double amount) {
        if (this.bankAccount.getBalance() < amount) {
            System.out.println("Insufficient funds for transfer!");
            return;
        }
        this.bankAccount.withdraw(amount);
        recipient.bankAccount.deposit(amount);

        System.out.println(name + " transferred $" + amount + " to " + recipient.getName());
    }

    public void printAccountDetails() {
        System.out.println("Customer: " + name);
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: $" + bankAccount.getBalance());
    }
}
