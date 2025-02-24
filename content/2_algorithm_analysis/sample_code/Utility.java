public class Utility {

    // Measure execution time of a given algorithm
    public static double measureExecutionTime(Runnable algorithm) {
        long startTime = System.currentTimeMillis();
        algorithm.run();
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }
}
