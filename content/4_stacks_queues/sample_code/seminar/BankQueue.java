// BankQueue to manage customer service queue
import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {
    private Queue<Customer> customerQueue;
    
    public BankQueue() {
        this.customerQueue = new LinkedList<>();
    }
    
    public void addCustomerToQueue(Customer customer) {
        customerQueue.offer(customer);
        System.out.println(customer.getName() + " added to the queue.");
    }
    
    public void serveCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }
        Customer served = customerQueue.poll();
        System.out.println("Serving customer: " + served.getName());
    }
    
    public void printQueue() {
        if (customerQueue.isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }
        System.out.println("Current queue:");
        for (Customer c : customerQueue) {
            System.out.println("- " + c.getName());
        }
    }
}