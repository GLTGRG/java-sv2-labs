package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name!");
        String owner = scanner.nextLine();
        System.out.println("Enter your bank account number!");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter the balance!");
        int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);
        System.out.println("Your account information:");
        System.out.println(bankAccount.getInfo());

        System.out.println("Enter the amount you want to deposit!");
        int dpamount = scanner.nextInt();
        bankAccount.deposit(dpamount);
        System.out.println("Your account information:");
        System.out.println(bankAccount.getInfo());

        System.out.println("Enter the amount you want to withdraw!");
        int wdamount = scanner.nextInt();
        bankAccount.withdraw(wdamount);
        System.out.println("Your account information:");
        System.out.println(bankAccount.getInfo());
    }
}
