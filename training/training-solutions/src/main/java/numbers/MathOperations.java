package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is the result?");
        System.out.println("4+5*2-1+3/4");
        double answer = scanner.nextDouble();

        double solution = 4+5*2-1+3/4D;

        if (Math.abs(solution-answer)<0.0001){
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
    }
}
