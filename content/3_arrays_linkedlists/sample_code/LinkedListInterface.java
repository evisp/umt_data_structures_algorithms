/**
 * Interface defining the common operations for a linked list.
 */
public interface LinkedListInterface<T> {
    
	void insert(T data);
	void insertAt(int index, T data);
    
    boolean delete(T data);
    boolean deleteAt(int index);
    
    void display();    
    boolean search(T data);
  
    T get(int index);
    int size();
    boolean isEmpty();
    
    void reverse();
    
    Object[] toArray();
}
