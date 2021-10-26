package introdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PerformanceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Performance performance = new Performance("Tool", LocalDate.of(2022, 05, 24), LocalTime.of(20, 00), LocalTime.of(23, 00));

        System.out.println(performance.getInfo());
    }
}
