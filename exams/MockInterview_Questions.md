# Mock Interview Questions

## **True or False Statements**  

- **Big-O notation provides an exact measurement of an algorithm’s runtime for all inputs.** *(False – It describes asymptotic behavior, not exact runtime.)*  

- **A dynamically allocated array in Java (ArrayList) always provides O(1) time complexity for insertions at any position.** *(False – Insertions in the middle or beginning take O(n) due to shifting elements.)*  

- **If a problem is NP-Complete, it means there is no polynomial-time algorithm that solves it optimally.** *(False – It means no polynomial-time solution is *known*; proving P = NP would change this.)*  

- **The worst-case time complexity of QuickSort is O(n log n).** *(False – Worst case is O(n²) if the pivot is poorly chosen, though average-case is O(n log n).)*  

- **Recursion always uses more memory than an equivalent iterative solution.** *(False – It depends; some tail-recursive functions can be optimized to iterative form by the compiler.)*  

- **Merge Sort is always preferable to QuickSort because it has a guaranteed O(n log n) time complexity.** *(False – Merge Sort requires O(n) extra space, while QuickSort is in-place and often faster in practice.)*  

- **If two algorithms have the same Big-O complexity, they will always have the same runtime for all inputs.** (False – Big-O describes asymptotic behavior, but constants and lower-order terms can still make one algorithm faster in practice.)

- **In a singly linked list, reversing the list always requires O(n) extra space**. (False – It can be done in O(1) space by modifying the links instead of creating a new list.)

- **A stack can be efficiently implemented using either an array or a linked list, both providing O(1) push and pop operations**. (True – Both implementations allow constant-time operations, though linked lists use extra space for pointers.)

- **Binary search can only be applied to sorted arrays, not other data structures**. (False – Binary search works on any sorted collection with efficient random access, such as arrays, but is inefficient for linked lists.)

## Bug Hunt

### Binary Search

The provided binary search algorithm is meant to find a target value in a sorted array. Review the code for logical or syntactical issues that could prevent it from functioning correctly.

```java
public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length;
    while (left < right) {  
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) right = mid - 1;
        else left = mid + 1;
    }
    return -1;
}
```

### Selection Sort

The provided selection sort algorithm is designed to sort an array of integers in ascending order. Review the code for any logical or syntactical issues that could prevent it from working correctly.

```java
class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = 0;
            for (int j = i + 1; j <= arr.length; j++) { 
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            arr[i] = arr[minIndex];  
            arr[minIndex] = arr[i];  
        }
    }
}

```

### Linked List

#### Task 1

The provided linked list implementation includes an `addToEnd` method meant to add a new node at the end of the list. Review the code for any logical or syntactical issues that could prevent it from functioning correctly.

#### Task 2

The provided linked list implementation includes a `removeAtBeginning` method that is meant to remove the first node from the list. Review the code for any logical or syntactical issues that could prevent it from working correctly.

```java
class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addToEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = newNode; 
    }

    public void removeAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
        }
        head.value = head.next.value;
        head.next = head.next.next; 
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.addToEnd(10);
        list.addToEnd(20);
        list.addToEnd(30);
        
        System.out.println("Before removal:");
        list.printList(); 

        list.removeAtBeginning();

        System.out.println("After removal:");
        list.printList(); 
    }
}
```
---

## Explain like I am 5

### Big-O Notation
- **Explain Big-O Notation**: How would you explain what Big-O notation means to someone who doesn't know what algorithms are, using an analogy?

### Recursion  
- **Explain Recursion**: How would you explain recursion in simple terms, including how it works and what happens when the process is repeated?

### Array vs Linked Lists  
- **Explain the Difference Between an Array and a Linked List**: How would you explain the difference between an array and a linked list, focusing on their structure and how elements are stored and accessed?

### Stacks vs Queues  
- **Explain the Difference Between a Stack and a Queue**: How would you explain the difference between a stack and a queue, and how elements are added and removed in each?

---

## LeetCode Style Algorithmic Problems

### 1. **Find Missing Number**

- **Problem Description:**  
  You are given an array of `n` distinct numbers taken from the range `1` to `n+1`. The array is missing one number from this range. Your task is to find the missing number.

- **Input:**  
  - An array `nums` of size `n` where each element is a distinct integer from the range `[1, n+1]`.

- **Output:**  
  - A single integer, which is the missing number from the array.

- **Example 1:**  
  Input: `nums = [3, 7, 1, 2, 8, 4, 5]`  
  Output: `6`

- **Example 2:**  
  Input: `nums = [1, 2, 3, 4, 6]`  
  Output: `5`

- **Constraints:**
  - The array `nums` will have distinct elements.
  - Time complexity should be O(n) and space complexity should be O(1) if possible.

---

### 2. **Reverse an Array**

- **Problem Description:**  
  Given an array of integers, you need to reverse the elements of the array in place.

- **Input:**  
  - An array `nums` of integers.

- **Output:**  
  - The same array with its elements reversed.

- **Example 1:**  
  Input: `nums = [1, 2, 3, 4, 5]`  
  Output: `[5, 4, 3, 2, 1]`

- **Example 2:**  
  Input: `nums = [10, 20, 30]`  
  Output: `[30, 20, 10]`

- **Constraints:**
  - The array may contain both positive and negative integers.
  - You must perform the reversal in-place (without using extra arrays or lists).

### 3. **Sum of Elements in an Array (Recursive)**

- **Problem Description:**  
  Given an array of integers, return the sum of all its elements using recursion.

- **Input:**  
  - An array `nums` of integers.

- **Output:**  
  - A single integer representing the sum of the elements in the array.

- **Example 1:**  
  Input: `nums = [1, 2, 3, 4, 5]`  
  Output: `15`

- **Example 2:**  
  Input: `nums = [10, 20, 30]`  
  Output: `60`

---

### 4. **Find Maximum Element in an Array (Recursive)**

- **Problem Description:**  
  Given an array of integers, find and return the maximum element in the array using recursion.

- **Input:**  
  - An array `nums` of integers.

- **Output:**  
  - A single integer representing the maximum element in the array.

- **Example 1:**  
  Input: `nums = [3, 1, 4, 1, 5, 9, 2]`  
  Output: `9`

- **Example 2:**  
  Input: `nums = [10, 20, 15, 7]`  
  Output: `20`

---

## Algorithm Battles (Group Debate)

### **Merge Sort vs Quick Sort Debate**

**Objective:**  
Each group must present a compelling argument for why their assigned sorting algorithm is the superior choice in terms of performance, use cases, and practical advantages.

**Task:**
- **Group 1:** Defend **Quick Sort**  
- **Group 2:** Defend **Merge Sort**

---

## Speed Coding Challange

### **Palindrome Check**
- **Task**: Write a function that checks if a given string is a palindrome (a word, phrase, or sequence that reads the same forwards and backwards).
- **Requirements**:
  - The function should take a single string as input.
  - The function should ignore case and spaces (consider the string case-insensitive and without spaces).
  - The function should return `true` if the string is a palindrome, otherwise `false`.
  - **Example Input**: `"madam"`, **Example Output**: `true`
  - **Example Input**: `"hello"`, **Example Output**: `false`

### **Sum of Digits**
- **Task**: Write a function that takes an integer and returns the sum of its digits.
- **Requirements**:
  - The function should take a single integer as input.
  - The function should return the sum of the digits of the number.
  - You should not convert the number to a string to solve the problem.
  - **Example Input**: `1234`, **Example Output**: `10` (1 + 2 + 3 + 4 = 10)
  - **Example Input**: `987`, **Example Output**: `24` (9 + 8 + 7 = 24)

---


## (Whiteboard Interview)

### **To-Do List Application **  

The goal is to explain the structure of a To-Do List application that allows users to manage tasks. You will walk through the design and logical steps required to build the app, thinking through how data should be stored and manipulated, how to handle user input, and how to ensure the application is efficient. This is not about writing code, but instead about how you would break down the problem and organize your approach.

**Key Questions**:
- How would you structure the data to store each task and its attributes (e.g., title, due date, priority)?
- How would you efficiently filter tasks by completion status or sort them by priority and due date?
- How would you handle edge cases, such as when there are no tasks or invalid user input (e.g., adding a task with no title)?

---

### **Online Book Store Search System (Whiteboard Interview)**  

You are tasked with designing a book search system for an online store. The goal is to explain how you would structure the system to allow users to search for books by various attributes such as title, author, and genre. You will need to discuss how data would be stored, how search queries would be handled, and how the system would ensure that results are returned quickly and accurately.

**Key Questions**:
- How would you organize and store the book data to make searching efficient (e.g., sorting, indexing)?
- What search algorithm or technique would you use to find the most relevant books based on user queries (e.g., title, author, genre)?
- How would you handle edge cases, such as no results for a search, invalid input, or very common search terms that return too many results?