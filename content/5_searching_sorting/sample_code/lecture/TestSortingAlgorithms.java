import java.util.Random;
import java.util.Arrays;

public class TestSortingAlgorithms {
    public static void main(String[] args) {
        int size = 50;
        int[] originalArray = generateRandomArray(size);

        System.out.println("Original Array: ");
        printArray(originalArray);

        // Bubble Sort
        int[] bubbleSorted = Arrays.copyOf(originalArray, size);
        SortingAlgorithms.bubbleSort(bubbleSorted);
        System.out.println("\nBubble Sort: ");
        printArray(bubbleSorted);

        // Selection Sort
        int[] selectionSorted = Arrays.copyOf(originalArray, size);
        SortingAlgorithms.selectionSort(selectionSorted);
        System.out.println("\nSelection Sort: ");
        printArray(selectionSorted);

        // Insertion Sort
        int[] insertionSorted = Arrays.copyOf(originalArray, size);
        SortingAlgorithms.insertionSort(insertionSorted);
        System.out.println("\nInsertion Sort: ");
        printArray(insertionSorted);

        // Quick Sort
        int[] quickSorted = Arrays.copyOf(originalArray, size);
        SortingAlgorithms.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nQuick Sort: ");
        printArray(quickSorted);

        // Merge Sort
        int[] mergeSorted = Arrays.copyOf(originalArray, size);
        SortingAlgorithms.mergeSort(mergeSorted, 0, mergeSorted.length - 1);
        System.out.println("\nMerge Sort: ");
        printArray(mergeSorted);
    }

    // Generates an array with random numbers
    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100); // Random numbers between 0 and 99
        }
        return arr;
    }

    // Prints the array in a readable format
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
