# ![Universiteti Metropolitan Tirana](https://umt.edu.al/wp-content/uploads/2024/11/Universiteti-Metropolitan-Tirana.webp)  

# ✅ **Week 6: Recursion**

### **Introduction to Recursion in Java**

**Recursion is a technique where a method calls itself to solve a problem**. In recursion, a problem is broken down into smaller subproblems, and each subproblem is solved in a similar way until the base case (or stopping condition) is reached.

#### **Key Phases of Recursion**

1. **Base Case**: This is the condition that ends the recursion. It prevents the function from calling itself indefinitely.
   
2. **Recursive Case**: This is the part where the method calls itself to break the problem down into smaller subproblems.

#### **Things to Keep in Mind**

- **Think of the problem as a smaller version of itself**: Break down the problem into smaller, similar subproblems.
- **Base case is crucial**: Without a base case, recursion will never stop and will lead to a stack overflow error.
- **Recursive calls "stack up"**: Each recursive call uses the stack (memory), so excessive recursion might lead to a memory limit being reached.

---

### **How Recursion Works**

Imagine you have a task that you can break down into smaller tasks of the same type. Instead of solving the whole problem at once, you solve smaller parts and use those solutions to build up the final answer.

Example: **Factorial of a number**

The factorial of a number `n` is defined as:
- `factorial(0) = 1`
- `factorial(n) = n * factorial(n - 1)` for `n > 0`

In simple terms, `factorial(5)` is `5 * factorial(4)`, and `factorial(4)` is `4 * factorial(3)`, and so on, until you reach `factorial(0)`.

### **Recursive Example: Factorial in Java**

```java
public class RecursionExample {
    public static int factorial(int n) {
        if (n == 0) {  // Base case
            return 1;
        }
        return n * factorial(n - 1);  // Recursive case
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // Output: 120
    }
}
```

### **Another Example: Fibonacci Series**

The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones:
- `fib(0) = 0`
- `fib(1) = 1`
- `fib(n) = fib(n - 1) + fib(n - 2)` for `n > 1`

Here's the Java code for the Fibonacci sequence:

```java
public class FibonacciExample {
    public static int fibonacci(int n) {
        if (n == 0) {  // Base case
            return 0;
        } else if (n == 1) {  // Base case
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));  // Output: 8
    }
}
```

### **Common Pitfalls to Avoid**

- **Missing base case**: If you forget the base case, the function will keep calling itself endlessly, which leads to a `StackOverflowError`.
  
- **Inefficiency in large problems**: Recursion can be inefficient if not implemented carefully. For example, calculating Fibonacci numbers recursively results in repeated calculations. This can be optimized with techniques like **memoization** or **dynamic programming**.

### **When to Use Recursion**

Recursion is useful when:
1. A problem can naturally be broken down into similar subproblems (like searching a tree, traversing a graph, or working with data structures like linked lists).
2. You want a simple, elegant solution to problems that involve dividing and conquering.
   
---

### **Key Takeaways**

- Recursion is a powerful technique but can be tricky to implement correctly.
- Always define a **base case** to stop the recursion.
- Keep an eye on efficiency—recursion can sometimes be slow or cause stack overflow if used improperly.
- Some problems (like tree traversals, sorting algorithms, etc.) are inherently recursive and can be much easier to solve with recursion.

---