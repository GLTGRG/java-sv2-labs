package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a hour!");
        int hour = scanner.nextInt();
        System.out.println("Enter a minute!");
        int minute = scanner.nextInt();
        System.out.println("Enter a second!");
        int second = scanner.nextInt();

        System.out.printf("Enter another hour!");
        int anotherHour = scanner.nextInt();
        System.out.println("Enter another minute!");
        int anotherMinute = scanner.nextInt();
        System.out.println("Enter another second!");
        int anotherSecond = scanner.nextInt();

        Time time = new Time(hour, minute, second);
        Time anotherTime = new Time(anotherHour, anotherMinute, anotherSecond);

        System.out.println(time.toString() + " = " + time.getInMinutes());
        System.out.println(anotherTime.toString() + " = " + anotherTime.getInSeconds());
        System.out.println("The first is earlier than the second: " + time.earlierThan(anotherTime));



    }
}
