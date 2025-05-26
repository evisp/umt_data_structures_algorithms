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
