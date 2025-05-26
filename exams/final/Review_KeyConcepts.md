# ![Universiteti Metropolitan Tirana](https://umt.edu.al/wp-content/uploads/2024/11/Universiteti-Metropolitan-Tirana.webp)  


# Mock Exam: Data Structures & Algorithms

## Overview

The final exam assesses fundamental and advanced concepts in data structures and algorithms, combining theory, code analysis, pseudocode, and problem solving. 

Total Points
- 50 points for the Software Engineering and AI group
- 60 points for the Computer Engineering group


---

## Exam Structure

| Section                             | Points | Description                                                                                   |
|-----------------------------------|--------|-----------------------------------------------------------------------------------------------|
| **1. True / False with Explanation**      | 5      | Conceptual questions to test understanding and identify common misconceptions. Brief explanations required. |
| **2. Code Output (Stacks, Queues, Lists)**| 8      | Analyze and trace code snippets involving stacks, queues, and lists. Predict outputs and provide concise explanations |
| **3. Key Concepts: Trees and Graphs**     | 8      | Interpret diagrams or scenarios related to trees and graphs. Questions may involve traversals, properties, or algorithms like Dijkstra’s and A-Star |
| **4. Key Algorithms (Pseudocode + Complexity)** | 15     | Write or complete pseudocode for algorithms related to recursion, searching, sorting, and graph/tree operations. Include time complexity analysis. |
| **5. Data Structure Selection for Use Cases** | 6      | Given practical scenarios, select the most appropriate data structure(s) and justify your choices. |
| **6. Coding Problem (LeetCode-style)** | 8      | Solve a (challenging) programming problem focusing on algorithmic design, correctness, and edge cases. |

---

## Example of Questions

### 1. True / False Questions (with concise explanations)


Mark the following statements as `True` or `False`. Provide a concise explanation (1 - 2 sentences)

1. A recursive algorithm always uses more memory than its iterative equivalent.*

2.  Breadth-first search (BFS) can be used to find the shortest path in weighted graphs where all edges have equal weight.

3. The time complexity of binary search on any array is O(log n).

4. In a binary search tree (BST), the left subtree contains only nodes with keys less than the parent node’s key.

5. Dijkstra’s algorithm can be used to find the shortest path in graphs with negative edge weights.

---


### 2. Code Output

Analyze and trace the following code snippets. **What is the output?**. Provide a concise explanation

```java
List<String> algorithms = new ArrayList<>();
algorithms.add("DFS");
algorithms.add("BFS");
algorithms.add("Dijkstra");

Stack<String> stack = new Stack<>();
for (String alg : algorithms) {
    stack.push(alg);
}
stack.pop();
stack.push("A*");

while (!stack.isEmpty()) {
    System.out.print(stack.pop() + " ");
}
```

```java
Queue<String> queue = new LinkedList<>();
queue.offer("Array");
queue.offer("LinkedList");
queue.offer("Heap");

Stack<String> stack = new Stack<>();
while (!queue.isEmpty()) {
    String ds = queue.poll();
    if (!ds.equals("LinkedList")) {
        stack.push(ds);
    }
}

while (!stack.isEmpty()) {
    System.out.print(stack.pop() + " ");
}
```

```java
List<String> list = new ArrayList<>();
list.add("QuickSort");
list.add("MergeSort");
list.add("HeapSort");

Stack<String> stack = new Stack<>();
stack.push(list.remove(1));  

Queue<String> queue = new LinkedList<>();
queue.offer(list.remove(0)); 

list.add("Bubble Sort");
queue.offer("Selection Sort");

System.out.println(stack.peek() + " " + queue.peek() + " " + list.get(0));
```

---


### 3. Key Concepts: Trees and Graphs

#### Trees

##### Tree Traversals


Consider the following tree, and briefly answer the questions
```
           Root
         /      \
       Alpha    Beta
      /    \       \
   Gamma  Delta    Omega
```


- List the nodes visited in a *preorder* and *postorder* traversal.
- A custom traversal visits:
    - Right child
    - Node itself
    - Left child  
  Write the sequence of nodes visited using this traversal.  
  Explain how your answer differs from standard in-order.
- Given the following:
    - Inorder: D B E A F C
    - Preorder: A B D E C F  
  Draw the binary tree represented by these traversals.
- You insert the values `{50, 30, 70, 20, 40, 60, 80}` into an empty BST (in that order).  
  What is the inorder traversal of the resulting BST?  
  Why is this traversal significant in BSTs?


##### Structural Properties

- What is the height of the tree?  
  Explain briefly how it is calculated.
- What is the difference between height and depth in a tree?
- Which nodes are leaves? Which are internal nodes? List them separately.


##### Insertion & Deletion Logic

- Suppose you delete a node from a BST that has two children.  
  Describe how the BST property is maintained after deletion.  
  What do we replace the deleted node with?
- You insert values `{40, 20, 60, 10, 30, 50, 70}` into an empty BST.  
  Then, you delete `60`. Which node replaces `60`, and why?

##### Logical Reasoning & Edge Cases

- **True or False**: In any binary tree, the number of nodes is always greater than the height.  
  Justify with a counterexample or explanation.
- **True or False**: A balanced BST always has the minimum possible height.  
  Explain your reasoning. Provide a counterexample if false.
- **True or False**: In a BST, the depth of the leftmost node is always equal to the height of the tree.  
  Justify your answer with an example.
- You are repeatedly inserting sorted values (e.g., `{10, 20, 30, 40, 50}`) into a regular BST.  
  What structural issue might arise, and how would it affect performance?
- A student claims that `The maximum value in any BST must be in the leftmost node.`  
  Is this correct? If not, what is the correct statement and why?
- If a BST has height `h`, what is the worst-case time complexity of searching for a value?
- How can a binary search tree (BST) help in speeding up search operations compared to an unsorted array?  
  Give a short explanation using time complexity.


####  Graphs

##### Fundamental Properties of Graphs

Consider the following undirected graph representing cities connected by roads:

```
[A]-----3-----[B]
 |             |
 2             4
 |             |
[D]-----1-----[C]
 |
 5
[E]
```

- Represent the graph using:
    - an **adjacency list**
    - an **adjacency matrix**
- What is the degree of node `A`?
- Is the graph fully connected? Justify your answer.
- Which node, if removed, would disconnect the graph? Explain your reasoning.
- Which node is most `central` in terms of connectivity? Do you think that concept might  matter in road networks?
- If we want to place an emergency facility (e.g., a hospital) in one city to minimize maximum travel distance to others, which city is the best candidate? Why?
- List the order of nodes visited in **Depth-First Search (DFS)** starting from node A.
- List the order of nodes visited in **Breadth-First Search (BFS)** starting from node A.
- Suppose the weights represent distances in kilometers.  
  Use **Dijkstra’s algorithm** to compute the shortest path from A to all other nodes.  
  Provide the final distance table.
- Which traversal (DFS or BFS) is more suitable for finding the shortest path in **unweighted** graphs? Why?

##### Graph Algorithms

- Using Dijkstra’s algorithm, fill in the distance table for computing the shortest paths from A to all other nodes.
- What is the main difference between Dijkstra’s and A in terms of node selection during traversal?*
- Why does Dijkstra's algorithm always choose the node with the smallest known distance? How does this ensure optimality?
- What is the role of the `f(n) = g(n) + h(n)` function in `A*`? Briefly describe each term.
- Can `A*` produce a non-optimal path? Under what condition(s)?
- Can Dijkstra's algorithm be seen as a special case of `A*`? Explain using the f-score formula.
- You have limited memory and don't care about exact shortest paths. Would you prefer Dijkstra’s or `A*`? Justify your answer.

---

### 4. Key Algorithms (Pseudocode + Complexity)

#### Binary Search Tree (BST) Search
- Write pseudocode to search for a key `k` in a BST. 
- Clearly describe base case, recursive step, and return logic.
- What is the best- and worst-case time complexity? Under what conditions does each occur?

#### BFS Traversal of a Graph

- Complete the pseudocode for BFS using a queue and visited set
```
Function BFS(Graph G, StartNode s)
    create empty queue Q
    mark s as visited
    enqueue s onto Q

    while Q is not empty do
        _______ ← dequeue a node u
        for each neighbor v of u do
            if v not visited then
                _______
                _______

```
- Explain the time complexity in terms of `V` (vertices) and `E` (edges).

#### Reversing an Array

- Write pseudocode to reverse an array. Briefly describe your strategy
- What is the time and space complexity? Explain.

#### Binary Search Algorithm

- Write pseudocode for binary search on a sorted array. You may write an iterative
or a recursive function
- What is the time complexity? Why is it better than linear search for sorted arrays?

#### Merge Sort Algorithm

- What is the key idea of the merge sort algorithm. Highlight the key steps as pseudocode
- Clearly indicate recursive calls and the merge process.
- What is the time complexity in best, average, and worst cases? Why is it preferred over simpler sorts for large datasets?

#### Quick Sort Algorithm
- Complete the pseudocode for the Partition step in Quick Sort using pivot:
```
Function Partition(_______________)
    pivot ← arr[high]
    i ← low - 1
    for j ← low to high - 1 do
        if _______________then
            i ← i + 1
            swap arr[i] and arr[j]
    _______________
    return _______________

```
--- 

### 5. Data Structure Selection for Use Cases

#### Efficient Undo/Redo in a Text Editor

A text editor needs to support undo and redo operations efficiently, where users can revert their last actions or reapply undone actions in order. The operations should be performed quickly without scanning the entire history.

Which data structure(s) would you use to implement this functionality? Explain your choice.

#### Real-Time Task Scheduling System

You are designing a system that manages tasks with different priorities. Tasks arrive continuously, and the system must always execute the highest priority task available next. Tasks with the same priority should be executed in the order they arrived.

What data structure(s) will you use to implement this scheduler? Justify your answer.

#### Web Browser History Navigation

A web browser records the pages visited by a user. The user can go back to previously visited pages and then forward again, as long as no new page is visited after going back.

Which data structure(s) would best support this navigation behavior and why?

#### Autocomplete Suggestions for a Search Engine

You are implementing an autocomplete feature that suggests possible query completions as the user types. The data structure must support fast prefix searches and efficient insertions of new terms.

What data structure(s) would you choose to implement autocomplete? Explain your reasoning.

#### Social Network Friend Recommendation

In a social networking app, you want to efficiently find “friends of friends” for friend suggestions. The data structure should quickly handle queries about connections between users.

Which data structure(s) would be appropriate for modeling and querying this data? Explain.

### 6. Coding Problems (LeetCode-style)

#### Merge Two Sorted Linked Lists
Given two singly linked lists sorted in ascending order, merge them into a single sorted linked list and return the head.

- Implement the function (or pseudocode) `ListNode mergeTwoLists(ListNode l1, ListNode l2)`
- Consider edge cases where one or both lists are empty.

#### Validate Binary Search Tree
Given the root of a binary tree, determine if it is a valid Binary Search Tree (BST). A BST must satisfy the property that `left subtree nodes < node < right subtree nodes` for every node.

- Implement `boolean isValidBST(TreeNode root)`
- Think carefully about edge cases like duplicate values or `null` nodes.

#### Find the kth Smallest Element in a BST
Given a BST, return the `kth` smallest element in the tree.
- Implement int `kthSmallest(TreeNode root, int k)`
- Consider time and space efficiency.

####  Check if Graph is Connected (Undirected)
Given an undirected graph, determine if it is connected (there is a path between every pair of nodes).
- Input: Number of vertices `n`, edge list
- Use DFS or BFS to check connectivity.