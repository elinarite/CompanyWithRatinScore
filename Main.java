package TaskWork.BasicForAll4;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter number of employee");
        WorksMethod.setNumberOfEmployee(scanner.nextInt());
        WorksMethod.print();
    }
}