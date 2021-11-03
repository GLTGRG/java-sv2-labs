package intromethods.registration;

import javax.sound.midi.SysexMessage;
import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String getFullName(String lastName, String firstName) {
        return lastName + " " + firstName;
    }

    public LocalDate getDateOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The following information is required for registration:");
        System.out.println("Enter your first name!");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name!");
        String lastName = scanner.nextLine();

        System.out.println("Enter your year of birth!");
        int year = scanner.nextInt();
        System.out.println("Enter your month of birth!");
        int month = scanner.nextInt();
        System.out.println("Enter your day of birth!");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter year E-mail address!");
        String email = scanner.nextLine();

        String fullName = new Registration().getFullName(lastName, firstName);
        LocalDate dateOfBirth = new Registration().getDateOfBirth(year, month, day);

        Person person = new Person(fullName, dateOfBirth, email);

        System.out.println(person.toString());


    }
}
