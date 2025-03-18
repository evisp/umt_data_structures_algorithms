public class Employee {
    private String firstName;
    private String gender;
    private double salary;
    private String team;

    // Constructor
    public Employee(String firstName, String gender, double salary, String team) {
        this.firstName = firstName;
        this.gender = gender;
        this.salary = salary;
        this.team = team;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Employee{FirstName='" + firstName + "', Gender='" + gender + "', Salary=" + salary + ", Team='" + team + "'}";
    }
}
