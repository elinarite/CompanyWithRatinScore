package TaskWork.BasicForAll4;

public class Employee implements Comparable<Employee> {
    private String employeeName;
    private int employeeAge;
    private double salary;
    private Rating rating;
    Department department;


    public Employee() {
    }

    public Employee(String employeeName, int employeeAge, double salary, Rating rating, Department department) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.salary = salary;
        this.rating = rating;
        this.department = department;
    }

    /**
     * comparator, which sorts by name, age and salary
     *
     * @param employee the object to be compared.
     */
    @Override
    public int compareTo(Employee employee) {
        if (this.employeeName.compareTo(employee.getEmployeeName()) != 0) {
            return this.employeeName.compareTo(employee.getEmployeeName());
        }
        if (this.employeeAge - employee.getEmployeeAge() != 0) {
            return this.employeeAge - employee.getEmployeeAge();
        }
        return (int) (this.salary - employee.getSalary());
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Name: " + employeeName + ", Age: " + employeeAge +
                ", salary " + salary +
                ", rating " + rating + "\n";
    }
}