import java.util.List;

public class EmployeeSearch {

    // Linear Search Method
    public static Employee linearSearch(List<Employee> employees, String name) {
        int comparisons = 0;
        for (Employee employee : employees) {
            comparisons++;
            if (employee.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("Linear Search Comparisons: " + comparisons);
                return employee;
            }
        }
        System.out.println("Linear Search Comparisons: " + comparisons);
        return null;
    }

    // Binary Search Method (Assumes list is sorted by first name)
    public static Employee binarySearch(List<Employee> employees, String name) {
        int low = 0, high = employees.size() - 1, comparisons = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Employee midEmployee = employees.get(mid);
            comparisons++;

            int comparison = midEmployee.getFirstName().compareToIgnoreCase(name);
            if (comparison == 0) {
                System.out.println("Binary Search Comparisons: " + comparisons);
                return midEmployee;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Binary Search Comparisons: " + comparisons);
        return null;
    }
}
