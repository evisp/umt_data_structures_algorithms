# ![Universiteti Metropolitan Tirana](https://umt.edu.al/wp-content/uploads/2024/11/Universiteti-Metropolitan-Tirana.webp)  

---

# ✅ **Week 1: Introduction to the Course & Fundamental Concepts**

## 1. **Overview of Computer Systems, Algorithms, and Programming**

### **Computer Systems**
- A **computer system** consists of hardware and software that work together to perform tasks.
  - **Hardware**: Physical components like the CPU, memory, storage, etc.
  - **Software**: Programs that run on the hardware, enabling the computer to execute tasks.

### **What is an Algorithm?**
- An **algorithm** is a step-by-step procedure for solving a problem.
- **Key Characteristics**:
  - **Input**: The data or information you give to the algorithm.
  - **Output**: The result or solution produced by the algorithm.
  - **Well-defined steps**: The algorithm must be clear and unambiguous.
  - **Finite**: The algorithm must eventually stop after a finite number of steps.

---

## 2. **Importance of Algorithms**

### **Why Algorithms Matter**
- **Efficiency**: Algorithms allow us to solve problems efficiently. Whether you're sorting a list, searching for a specific item, or routing a message, the algorithm you use determines how fast and how much memory your solution requires.
- **Scalability**: Algorithms help solve problems at scale. A well-designed algorithm can handle thousands or millions of inputs, while a poorly designed one can bog down even small datasets.
- **Automation**: Algorithms are the foundation of automation. They allow systems to perform tasks with minimal human intervention, such as data processing, machine learning, and decision-making.

### **Real-World Use Cases**

1. **Google Search Engine**  
Google uses algorithms like PageRank to sort billions of web pages by relevance. These algorithms ensure that search results are delivered in milliseconds, making it easy for users to find what they need quickly.

2. **Social Media Feeds (Facebook, Instagram)**  
Recommendation algorithms on social media analyze your behavior to suggest posts, friends, and ads. These algorithms help keep users engaged and personalize their feed based on their interests and activity.

3. **Navigation Apps (Google Maps, Waze)**  
Navigation apps rely on shortest path algorithms like Dijkstra’s or A* search to calculate the fastest routes, considering factors like traffic and road closures. These algorithms enable users to navigate efficiently in real-time.

4. **Online Shopping (Amazon, eBay)**  
Recommendation systems on e-commerce platforms analyze your past searches and purchases to suggest products tailored to your preferences. This drives sales by enhancing the shopping experience and making relevant suggestions.

5. **Healthcare (Medical Diagnoses)**  
Diagnostic algorithms in healthcare analyze data such as X-rays or lab results to assist doctors in making faster and more accurate diagnoses. These algorithms help improve patient care by providing critical insights from complex medical data.

6. **Streaming Services (Netflix, Spotify)**  
Streaming platforms use content recommendation algorithms to suggest movies, shows, or songs based on your viewing or listening history. These algorithms personalize the user experience and encourage continued engagement with the service.

---

## 3. **Understanding Algorithm Efficiency: Time and Space Complexity (Big-O Notation)**

### **Why is Efficiency Important?**
- As problems grow larger, algorithms can become slow and inefficient. Understanding **efficiency** helps us choose the best algorithm for a given problem.

### **Time Complexity**
- **Time complexity** measures how the runtime of an algorithm changes as the size of the input increases.
- We use **Big-O notation** to express the worst-case time complexity.
  
  **Example**:  
  If an algorithm takes 2 seconds for 100 elements, and 4 seconds for 200 elements, its time complexity could be O(n), where **n** is the size of the input.

#### **Big-O Notation** (Time Complexity):

- **$O(1)$**: **Constant time** – The algorithm takes the same amount of time regardless of the input size.
  - **Example**: Accessing an element in an array by index.
  
- **$O(n)$**: **Linear time** – The algorithm's runtime grows linearly with the input size.
  - **Example**: Iterating through an array of size **n**.

- **$O(n^2)$**: **Quadratic time** – The algorithm's runtime grows quadratically as the input size increases.
  - **Example**: A nested loop iterating through all elements of an array twice.

- **$O(log n)$**: **Logarithmic time** – The algorithm's runtime grows logarithmically as the input size increases.
  - **Example**: [Binary search](https://www.geeksforgeeks.org/binary-search/) in a sorted array.

- **O(n log n)**: **Log-linear time** – A combination of linear and logarithmic growth.
  - **Example**: Merge sort or quicksort.

### **Space Complexity**
- **Space complexity** measures how much memory an algorithm needs as the input size increases.
- It's also expressed using Big-O notation.

  **Example**:  
  If an algorithm requires a list to store each element, the space complexity could be $O(n)$, where **n** is the number of elements in the list.

### **Real-World Use Cases**

- **Sorting Algorithms**:
  - **O(n^2)**: [Bubble sort](https://www.geeksforgeeks.org/bubble-sort-algorithm/), [Insertion sort](https://www.geeksforgeeks.org/insertion-sort-algorithm/). Useful for small datasets but inefficient for larger ones.
  - **O(n log n)**: [Merge sort](https://www.geeksforgeeks.org/merge-sort/), [Quick sort](https://www.geeksforgeeks.org/quick-sort-algorithm/). These are much more efficient for large datasets.

- **Searching Algorithms**:
  - **$O(1)$**: Hashmap lookup. Extremely fast and efficient.
  - **$O(n)$**: Linear search. Works for unsorted data but becomes slow for large inputs.
  - **$O(log n)$**: Binary search. Very efficient for large, sorted data.

### **Examples of Big-O in Action**

1. **$O(1)$** - **Constant time**  
   - Example: Accessing an element by index in an array.  
     ```java
     int element = arr[5];  // Constant time, O(1)
     ```

2. **$O(n)$** - **Linear time**  
   - Example: Iterating through an array to print all elements.  
     ```java
     for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);  // Linear time, O(n)
     }
     ```

3. **$O(n^2)$** - **Quadratic time**  
   - Example: Nested loops to check all pairs in an array.  
     ```java
     for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr.length; j++) {
             System.out.println(arr[i] + arr[j]);  // Quadratic time, O(n^2)
         }
     }
     ```

4. **$O(log n)$** - **Logarithmic time**  
   - Example: Binary search. Check to see if you understand it. No worries if you don't, we'll cover it later in the course. 
     ```java
     int binarySearch(int[] arr, int target) {
         int low = 0, high = arr.length - 1;
         while (low <= high) {
             int mid = low + (high - low) / 2;
             if (arr[mid] == target) return mid;
             else if (arr[mid] < target) low = mid + 1;
             else high = mid - 1;
         }
         return -1;  // Logarithmic time, O(log n)
     }
     ```

---

### Summary

- **Computer Systems**: Hardware and software working together to execute tasks.
- **Algorithms**: Step-by-step procedures to solve problems.
- **Programming**: Writing code to implement algorithms.
- **Time and Space Complexity**: Big-O notation helps us understand how an algorithm performs as the input grows.
  - Time complexity (e.g., $O(1), O(n), O(n^2)$) tells us how the algorithm’s runtime changes.
  - Space complexity tells us how much memory is used.
- **Real-World Importance**: Algorithms power many of the systems we use daily, from search engines to social media to healthcare.

