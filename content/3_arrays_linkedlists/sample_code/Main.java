public class Main {
    public static void main(String[] args) {
        LinkedListInterface<String> nameList = new SinglyLinkedList<>();
        
        // Insert names
        nameList.insert("James Bond");
        nameList.insert("Batman");
        nameList.insert("Iron Man");
        nameList.insert("Goku");

        System.out.println("Original List:");
        nameList.display();

        // Test insertAt
        nameList.insertAt(2, "John Wick");
        System.out.println("\nAfter inserting 'John Wick' at index 2:");
        nameList.display();

        // Test delete
        nameList.delete("Goku");
        System.out.println("\nAfter deleting 'Goku':");
        nameList.display();

        // Test deleteAt
        nameList.deleteAt(1);
        System.out.println("\nAfter deleting element at index 1:");
        nameList.display();

        // Test reverse
        nameList.reverse();
        System.out.println("\nAfter reversing the list:");
        nameList.display();

        // Test size
        System.out.println("\nSize of the list: " + nameList.size());

        // Test isEmpty
        System.out.println("Is the list empty? " + nameList.isEmpty());

        // Test toArray
        System.out.println("List as an array: " + java.util.Arrays.toString(nameList.toArray()));
    }
}
