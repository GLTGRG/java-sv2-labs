package controliteration.division;

import java.util.Scanner;

public class Division {
    private Scanner inputScanner = new Scanner(System.in);
    private int positiveNumber;
    private int divisionNumber;

    public void getInputs() {
        System.out.println("adj meg egy pozitiv egesz szamot, a program ennel kisebb szamokat fog kiirni");
        this.positiveNumber = Integer.parseInt(this.inputScanner.nextLine());
        System.out.println("hannyal oszthato szamokat szeretne kapni");
        this.divisionNumber = Integer.parseInt(this.inputScanner.nextLine());
    }

    public void getDividedNumbers() {
        // basic for ciklus
        String forOutput = "";
        for (int i = 0; i < positiveNumber; i++) {
            int divisionModulo = i % divisionNumber;
            if (divisionModulo == 0) {
                forOutput = forOutput.concat(i + ", ");
            }
        }
        System.out.println(forOutput);

        // basic forditott for ciklus
        String reverseForOutput = "";
        for (int i = positiveNumber; i >= 0; i--) {
            int divisionModulo = i % divisionNumber;
            if (divisionModulo == 0) {
                reverseForOutput = reverseForOutput.concat(i + ", ");
            }
        }
        System.out.println(reverseForOutput);

        //basic while ciklus
        int whileCount = 0;
        String whileOutput = "";
        while (whileCount <= positiveNumber) {
            int divisionModulo = whileCount % divisionNumber;
            if (divisionModulo == 0) {
                whileOutput = whileOutput.concat(whileCount + ", ");
            }
            whileCount++;
        }
        System.out.println(whileOutput);

    }
}
