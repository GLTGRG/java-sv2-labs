package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();

        System.out.println("Enter your username!");
        String userName = scanner.nextLine();
        System.out.println(userValidator.isValidUsername(userName) ? "" : "Invalid username!" );

        System.out.println("Enter your password!");
        String password1 = scanner.nextLine();
        System.out.println("Enter your password again!");
        String password2 = scanner.nextLine();
        System.out.println(userValidator.isValidPassword(password1, password2) ? "" : "Invalid password!");

        System.out.println("Enter your email address");
        String email = scanner.nextLine();
        System.out.println(userValidator.isValidEmail(email) ? "" : "Invalid email address!" );






    }
}
