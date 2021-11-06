package numbers;

import java.util.Scanner;

public class Percent {

    public double getValue(int number, int number2){
        return number*(number2/100.0);
    }

    public double getBase(int number, int number2){
        return ((double)number/(double)number2)*100;
    }

    public double getPercent(int number, int number2){
        return ((double)number2/(double)number)*100;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        Scanner scanner = new Scanner(System.in);

       System.out.println("Adjon meg egy egész számot!");
        int valueNumber = scanner.nextInt();

        System.out.println("Adjon meg még egy egész számot!");
        int valueNumber2 = scanner.nextInt();

        System.out.println("Az első számnak a második szám szerinti százaléka: " + percent.getValue(valueNumber,valueNumber2));

        System.out.println("Adjon meg egy egész számot!");
        int baseNumber = scanner.nextInt();

        System.out.println("Adjon meg még egy egész számot!");
        int baseNumber2 = scanner.nextInt();

        System.out.println("Az eredeti szám: " + percent.getBase(baseNumber,baseNumber2));

        System.out.println("Adjon meg egy egész számot!");
        int percentNumber = scanner.nextInt();

        System.out.println("Adjon meg még egy egész számot!");
        int percentNumber2 = scanner.nextInt();

        System.out.println("Az első számnak " + percent.getPercent(percentNumber,percentNumber2) + " százaléka a második");

    }
}
