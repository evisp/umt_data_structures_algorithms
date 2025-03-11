class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class ListStack<T> {
    private Node<T> top; // Top of the stack

    public ListStack() {
        top = null;
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public T peek() {
        if (isEmpty()) return null;
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
    	ListStack<Integer> intStack = new ListStack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Top element: " + intStack.peek()); // 20
        System.out.println("Popped: " + intStack.pop()); // 20

        ListStack<String> strStack = new ListStack<>();
        strStack.push("Hello");
        strStack.push("World");
        System.out.println("Top element: " + strStack.peek()); // World
        System.out.println("Popped: " + strStack.pop()); // World
    }
}
