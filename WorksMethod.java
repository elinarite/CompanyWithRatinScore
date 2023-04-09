package TaskWork.BasicForAll4;

import java.util.*;
// TODO непонятное имя класса. Если это сервисный класс, и он что делает?
// создает сотрудников, сортирует и печатает таком случае можно назвать StuffService
public class WorksMethod {
// TODO - не понял зачем это поле? Чтобы сделать сеет и гетер? Вижу, что больше оно нигде не используется
    /**
     * numberOfEmployer - entered by user via scanner
     */
    private static int numberOfEmployee;
    //TODO сканер лучше обьявлять локально там где будешь использовтаь , по месту
    static Scanner scanner = new Scanner(System.in);

    public static int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public static void setNumberOfEmployee(int numberOfEmployee) {
        WorksMethod.numberOfEmployee = numberOfEmployee;
    }

    // TODO - Хорошо, что к методам появились комментарии в формате явадок, но есть проблема,
    //  что ничего не понятно :)
    // Например - что делает этот метод? employeeList Из кода вижу, что он создает обьекты сотрудников, добавляет их в лист и
    // возвращает его.
    // Тогда лучше написать что то вроде
    // Creates stuff in number, given in paramether/Создает список сотрудников
    //public static List<Employee> createStuff(int employeeNumber) {
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

    //TODO - здесь мне нравится описание. Но, Эля - с именем метода, вышел перебор
    // employeeSalaryChangeAfterRatingComparison, я еле дочитал, устал
    // Как тебе такой вариант? - recalculateSalaries
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

    // TODO - отличное описание. Имя метода лучше - sortByRating
    /**
     * method, which sorts list of employees by rating
     */
    public static List<Employee> collectionSort(List<Employee> employeeList) {
        employeeList.sort(new ComparatorRating());
        return employeeList;
    }

    // TODO - написать, что делает метод, итак понятно что он что то печатает. Каждое слово важно
    // дальше не очень понятно - если метод печатает, то почему здесь еще и считывание числа сотрудников?
    // Или делай отдельный метод для считывания и передавай сюда
    // Или - по правильному: у тебя где то есть Класс со списом сотрудников. Ты передаешь его сюда методу принт и
    // этот метод их печатает. Или даже лучше метод принт деражать там где даннеы. То есть метод принт должен быть в классе со списком сотрудников
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
