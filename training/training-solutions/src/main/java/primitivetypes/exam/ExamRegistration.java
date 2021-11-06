package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exam exam = new Exam();

        System.out.println("Enter your name!");
        String name = scanner.nextLine();

        System.out.println("Enter your year of birth!");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter your month of birth!");
        int month = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter your day of birt!");
        int day = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter your zip code ");
        int zipCode = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter your average!");
        double average = Double.parseDouble(scanner.nextLine());

        LocalDate dateOfBirth = LocalDate.of(year, month, day);

        Person person = new Person(name, dateOfBirth, zipCode, average);

        exam.addPerson(person);

        System.out.println(exam.getAlreadyApplied().get(0).toString());
    }
}
