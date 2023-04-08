package TaskWork.BasicForAll4;

import java.util.*;

public class WorksMethod {

    /**
     * numberOfEmployer - entered by user via scanner
     */
    private static int numberOfEmployee;
    static Scanner scanner = new Scanner(System.in);

    public static int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public static void setNumberOfEmployee(int numberOfEmployee) {
        WorksMethod.numberOfEmployee = numberOfEmployee;
    }

    /**
     * Method, witch adds Employee to the List
     * @param numberOfEmployee - number of Employee
     * @return List with Employee
     */
    public static List<Employee> employeeList(int numberOfEmployee) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < numberOfEmployee; i++) {
            Employee employee = GenerationEmployee.generationEmployee();
            employeeList.add(employee);
        }
        return employeeList;
    }

    /**
     * method, which changes employee's wages based on rating
     */
    public static List<Employee> employeeSalaryChangeAfterRatingComparison(List<Employee> employeeList) {
        Iterator <Employee> iterator = employeeList.iterator();
        while(iterator.hasNext()){
          Employee employee  = iterator.next();
            if (employee.getRating().getRatingScore() == 0) {
            } else {
                employee.setSalary(employee.getSalary() * employee.getRating().getRatingScore());
            }
        }
        return employeeList;
    }

    /**
     * method, which sorts list of employees by rating
     */
    public static List<Employee> collectionSort(List<Employee> employeeList) {
        employeeList.sort(new ComparatorRating());
        return employeeList;
    }

    /**
     * method for print
     */
    public static void print() {
        System.out.print("Please enter number of employee: ");
        WorksMethod.setNumberOfEmployee(scanner.nextInt());
        List<Employee> employeeListBeforeSalaryBonus = employeeList(getNumberOfEmployee());
        Collections.sort(employeeListBeforeSalaryBonus);
        System.out.println("-----List of employees where sorts by name, age and salary------- ");
        System.out.println(employeeListBeforeSalaryBonus);
        System.out.println("-----List of employees where the salary was calculated based and sorts on the rating------- ");
        System.out.println();
        Object employeeListAfterSalaryBonus = employeeSalaryChangeAfterRatingComparison(collectionSort(employeeListBeforeSalaryBonus));
        System.out.println(employeeListAfterSalaryBonus);
    }
}
