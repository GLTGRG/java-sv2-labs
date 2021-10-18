package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("enter two integers!");
        Scanner scanner = new Scanner(System.in);
        int integer1 = scanner.nextInt();
        int integer2 = scanner.nextInt();
        System.out.println(String.valueOf(integer1) + "+" + String.valueOf(integer2));
        System.out.println(integer1 + integer2);
    }
}
