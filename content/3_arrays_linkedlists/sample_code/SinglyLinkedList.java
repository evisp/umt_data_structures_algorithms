/**
 * Generic Singly Linked List Implementation.
 * Implements a singly linked list with basic operations.
 *
 * @param <T> Type of elements in the list.
 */
public class SinglyLinkedList<T> implements LinkedListInterface<T> {
    /** Head node of the linked list. */
    private Node<T> head;

    /** Number of elements in the linked list. */
    private int size;

    /**
     * Inner Node class representing an element in the linked list.
     *
     * @param <T> Type of element stored in the node.
     */
    static class Node<T> {
        T data;
        Node<T> next;

        /**
         * Constructor to create a node with given data.
         *
         * @param data The data to be stored in the node.
         */
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Constructor to initialize an empty linked list.
     */
    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Returns the number of elements in the list.
     *
     * @return The size of the list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks if the linked list is empty.
     *
     * @return {@code true} if the list is empty, {@code false} otherwise.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Displays all elements in the linked list.
     */
    @Override
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    /**
     * Retrieves the element at a specific index in the list.
     *
     * @param index The index of the element to retrieve.
     * @return The data at the specified index.
     * @throws IndexOutOfBoundsException If the index is out of range.
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index out of bounds");
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * Inserts a new element at the end of the linked list.
     *
     * @param data The data to be inserted.
     */
    @Override
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    /**
     * Inserts an element at a specific index in the list.
     *
     * @param index The index at which to insert the element.
     * @param data  The data to insert.
     * @throws IndexOutOfBoundsException If the index is out of range.
     */
    @Override
    public void insertAt(int index, T data) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index out of bounds");
        Node<T> newNode = new Node<>(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    /**
     * Deletes the first occurrence of the given element from the list.
     *
     * @param data The data to delete.
     * @return {@code true} if the element was found and deleted, {@code false} otherwise.
     */
    @Override
    public boolean delete(T data) {
        if (head == null) return false;
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        if (current.next == null) return false;
        current.next = current.next.next;
        size--;
        return true;
    }

    /**
     * Deletes the element at the specified index.
     *
     * @param index The index of the element to delete.
     * @return {@code true} if deletion was successful, {@code false} otherwise.
     * @throws IndexOutOfBoundsException If the index is out of range.
     */
    @Override
    public boolean deleteAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index out of bounds");
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
        return true;
    }

    /**
     * Searches for an element in the linked list.
     *
     * @param data The data to search for.
     * @return {@code true} if the element exists in the list, {@code false} otherwise.
     */
    @Override
    public boolean search(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) return true;
            current = current.next;
        }
        return false;
    }

    /**
     * Reverses the linked list in place.
     */
    @Override
    public void reverse() {
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    /**
     * Converts the linked list to an array.
     *
     * @return An array containing all elements of the list.
     */
    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> current = head;
        int i = 0;
        while (current != null) {
            array[i++] = current.data;
            current = current.next;
        }
        return array;
    }
}
