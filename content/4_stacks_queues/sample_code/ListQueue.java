public class ListQueue<T> {
    private Node<T> front, rear;
    private int size;

    // Node class for Linked List
    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor: Initialize an empty Queue
    public ListQueue() {
        front = rear = null;
        size = 0;
    }

    // Enqueue: Add item at the rear of the queue
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Dequeue: Remove item from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return null; // or throw exception
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null; // Queue is now empty
        }
        size--;
        return item;
    }

    // Front: Get the front element of the queue
    public T front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null; // or throw exception
        }
        return front.data;
    }

    // IsEmpty: Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get size of the queue
    public int getSize() {
        return size;
    }

    // Main method for testing
    public static void main(String[] args) {
    	ListQueue<Integer> intQueue = new ListQueue<>();
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);

        System.out.println("Front item: " + intQueue.front());  // Expected output: 10
        System.out.println("Dequeued item: " + intQueue.dequeue());  // Expected output: 10
        System.out.println("Front item after dequeue: " + intQueue.front());  // Expected output: 20
        System.out.println("Queue size: " + intQueue.getSize());  // Expected output: 2

        // Test with a String queue
        ListQueue<String> stringQueue = new ListQueue<>();
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("World");

        System.out.println("Front item in string queue: " + stringQueue.front());  // Expected output: Hello
    }
}
