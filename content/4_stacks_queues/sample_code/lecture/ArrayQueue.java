public class ArrayQueue<T> {
    private T[] arr;
    private int front, rear, size, capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];  // Generic array
        front = size = 0;
        rear = -1;
    }

    // Enqueue: Add item at the rear
    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    // Dequeue: Remove item from the front
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }
        T item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Front: Get the front element
    public T front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return arr[front];
    }

    // IsEmpty: Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // IsFull: Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get size of the queue
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
    	ArrayQueue<Integer> intQueue = new ArrayQueue<>(5); // Queue of Integer type

        // Enqueue elements
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        intQueue.enqueue(40);
        intQueue.enqueue(50);

        // Print front element
        System.out.println("Front element: " + intQueue.front()); // 10

        // Dequeue and print each element
        while (!intQueue.isEmpty()) {
            System.out.println("Dequeued: " + intQueue.dequeue());
        }
    }
}
