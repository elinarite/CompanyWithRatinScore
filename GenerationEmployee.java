package TaskWork.BasicForAll4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// TODO Читала Пелевина Generation P? Вот оно!
// Если здесь имелось ввиду класс, который создает сотрудников, то
// это будет CreateEmployee, тк GenerationEmployee = Поколение сотрудников
public class GenerationEmployee {
    // такие вещи объявляй по месту локально
    static Random random = new Random();

    // в джаве есть библиотека которая тебе выдает осмысленные случайные имена - Faker
    // можно было ее использовать как вариант
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

    // TODO Нее вот это жесткая ошибка. Конструктор, который создает сотрудника и возвращает его тип
    // просто создай отдельный статичный метод, не конструктор
    // createRandomEmployee
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