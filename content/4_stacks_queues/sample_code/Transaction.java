// Transaction class to store transaction details
import java.util.Date;


class Transaction {
    enum Type { DEPOSIT, WITHDRAW, TRANSFER }
    private Type type;
    private double amount;
    private Date date;
    private String details;
    
    public Transaction(Type type, double amount, String details) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();
        this.details = details;
    }
    
    @Override
    public String toString() {
        return type + " of $" + amount + " on " + date + " (" + details + ")";
    }
    
    public String toCSV() {
        return type + "," + amount + "," + date + "," + details;
    }
}