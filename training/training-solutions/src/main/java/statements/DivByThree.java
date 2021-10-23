package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer!");
        int integer = scanner.nextInt();

        System.out.println(integer % 3 == 0 ? "This number is divisible by three!" : "This number is not divisible by three!");
    }
}
