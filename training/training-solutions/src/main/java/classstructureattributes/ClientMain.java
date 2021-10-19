package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name!");
        client.name = scanner.nextLine();
        System.out.println("Enter your year of birth!");
        client.yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your address!");
        client.address = scanner.nextLine();
        System.out.println("Name:" + client.name + " " + "Year of birth:" + client.yearOfBirth + " " + "Address:" + client.address);
    }
}
