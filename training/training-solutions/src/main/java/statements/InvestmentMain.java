package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of the investment!");
        int amount = scanner.nextInt();
        System.out.println("Enter the interest rate!");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(amount, interestRate);

        System.out.println("Capital: " + investment.getFund());
        System.out.println("Yield for 50 days : " + investment.getYield(50));
        System.out.println("amount withdrawn after 80 days: " + investment.close(80));
        System.out.println("amount withdrawn after 90 days: " + investment.close(90));
    }
}
