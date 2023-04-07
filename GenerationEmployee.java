package TaskWork.BasicForAll4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerationEmployee {
    static Random random = new Random();

  Employee employee = new Employee();

    /**
     * method, which generates name of employee
     */
    public static StringBuilder nameGeneration() {
        String abc = "abcdefghijklmnoprstuvz";
        int generationEmployeeNameLength = (random.nextInt(10) + 3);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < generationEmployeeNameLength; i++) {
            stringBuilder.append(abc.charAt(random.nextInt(abc.length())));
        }
        return stringBuilder;
    }

    /**
     * constructor, which generates employees
     */
    public static Employee generationEmployee() {
       String employeeName = String.valueOf(nameGeneration());
       int employeeAge = random.nextInt(60) + 18;
       double salary = random.nextDouble(10000) + 2000;
       Rating rating  = Rating.values()[random.nextInt(Rating.values().length)];
       Department department = Department.values()[random.nextInt(Department.values().length)];
       return new Employee(employeeName, employeeAge, salary, rating, department);
    }
}