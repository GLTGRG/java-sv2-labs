package introdate;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the employee's name!");
        String name = scanner.nextLine();

        System.out.println("Enter the employee's year of birth!");
        System.out.println("Enter the year then the month and then the day!");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        Employee employee = new Employee(name, year, month, day);

        System.out.println("Name: " + employee.getName());
        System.out.println("Date of birth: " + employee.getDateOfBirth());
        System.out.println("Date of recruitment: " + employee.getBeginEmployment());

        System.out.println("What became the new name of the employee?");
        scanner.nextLine();
        name = scanner.nextLine();
        employee.setName(name);

        System.out.println("Name changed: " + employee.getName());
        System.out.println("Date of birth: " + employee.getDateOfBirth());
        System.out.println("Date of recruitment: " + employee.getBeginEmployment());
    }
}
