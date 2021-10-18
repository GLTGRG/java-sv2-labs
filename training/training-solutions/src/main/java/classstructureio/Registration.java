package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        System.out.println("Enter Username");
        Scanner scanner = new Scanner (System.in);
        String userName = scanner.nextLine();
        System.out.println("Enter E-mail address");
        String emalAddress = scanner.nextLine();
        System.out.println("Username: " + userName + " " + "E-mail address: " + emalAddress);
    }
}
