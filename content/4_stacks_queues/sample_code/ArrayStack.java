public class ArrayStack<T> {
    private T[] stack;
    private int top;
    
    @SuppressWarnings("unchecked")
    public ArrayStack(int size) {  // Constructor
        stack = (T[]) new Object[size];
        top = -1;
    }
    
    public void push(T item) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
    }
    
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        return stack[top--];
    }
    
    public T peek() {
        if (isEmpty()) return null;
        return stack[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public static void main(String[] args) {
        ArrayStack<Integer> intStack = new ArrayStack<>(5);
        intStack.push(10);
        intStack.push(20);
        System.out.println("Top element: " + intStack.peek()); // 20
        System.out.println("Popped: " + intStack.pop()); // 20
        
        ArrayStack<String> strStack = new ArrayStack<>(3);
        strStack.push("Hello");
        strStack.push("World");
        System.out.println("Top element: " + strStack.peek()); // World
        System.out.println("Popped: " + strStack.pop()); // World
    }
}

