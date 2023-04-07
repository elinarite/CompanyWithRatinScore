package TaskWork.BasicForAll4;

import java.util.ArrayList;
import java.util.List;

public class WorksMethod {

    /**
     * numberOfEmployer - entered by user via scanner
     */
    private static int numberOfEmployee;

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
        for (Employee employee : employeeList) {
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
        List<Employee> object1 = employeeList(getNumberOfEmployee());
        System.out.println(object1);
        Object object2 = employeeSalaryChangeAfterRatingComparison(collectionSort(object1));
        System.out.println(object2);
    }
}