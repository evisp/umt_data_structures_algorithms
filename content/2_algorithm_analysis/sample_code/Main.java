import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] inputSizes = {1000, 10000, 100000};
        Random rand = new Random();

        for (int size : inputSizes) {
            System.out.println("Input size: " + size);

            // Generate random arrays
            int[] bubbleArr = generateRandomArray(size);
            int[] insertionArr = bubbleArr.clone();
            int[] selectionArr = bubbleArr.clone();
            int[] mergeArr = bubbleArr.clone();

            // Measure average time for Bubble Sort
            double bubbleTime = averageTime(() -> SortingAlgorithms.bubbleSort(bubbleArr), 10);
            System.out.println("Bubble Sort Time: " + bubbleTime + " milli seconds");

            // Measure average time for Insertion Sort
            double insertionTime = averageTime(() -> SortingAlgorithms.insertionSort(insertionArr), 10);
            System.out.println("Insertion Sort Time: " + insertionTime + " milli seconds");

            // Measure average time for Selection Sort
            double selectionTime = averageTime(() -> SortingAlgorithms.selectionSort(selectionArr), 10);
            System.out.println("Selection Sort Time: " + selectionTime + " milli seconds");

            // Measure average time for Merge Sort
            double mergeTime = averageTime(() -> SortingAlgorithms.mergeSort(mergeArr), 10);
            System.out.println("Merge Sort Time: " + mergeTime + " milli seconds");

            System.out.println();
        }
    }

    // Function to run an algorithm multiple times and return average time
    private static double averageTime(Runnable algorithm, int iterations) {
        double totalTime = 0;
        for (int i = 0; i < iterations; i++) {
            totalTime += Utility.measureExecutionTime(algorithm);
        }
        return totalTime / iterations;
    }

    // Generate a random array of a given size
    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000); // Random number between 0 and 999
        }
        return arr;
    }
}
