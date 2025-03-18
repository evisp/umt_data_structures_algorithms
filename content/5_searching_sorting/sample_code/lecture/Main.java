import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = readEmployeesFromFile("employees.csv");

        // Sort by first name for binary search
        employees.sort(Comparator.comparing(Employee::getFirstName));

        String nameToSearch = "Kimberly";

        // Linear Search
        Employee foundLinear = EmployeeSearch.linearSearch(employees, nameToSearch);
        if (foundLinear != null) {
            System.out.println("Found via Linear Search: " + foundLinear);
        } else {
            System.out.println("Employee not found via Linear Search.");
        }

        // Binary Search
        Employee foundBinary = EmployeeSearch.binarySearch(employees, nameToSearch);
        if (foundBinary != null) {
            System.out.println("Found via Binary Search: " + foundBinary);
        } else {
            System.out.println("Employee not found via Binary Search.");
        }
    }

    // Reads employees from CSV, discards rows with missing values
    private static List<Employee> readEmployeesFromFile(String filename) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // Skip header line

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",", -1); // Ensure empty fields are captured

                if (values.length < 4 || values[0].isEmpty() || values[1].isEmpty() || values[2].isEmpty() || values[3].isEmpty()) {
                    continue; // Skip this row if any field is missing
                }

                String firstName = values[0];
                String gender = values[1];
                double salary = Double.parseDouble(values[2]);
                String team = values[3];

                employees.add(new Employee(firstName, gender, salary, team));
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return employees;
    }
}
