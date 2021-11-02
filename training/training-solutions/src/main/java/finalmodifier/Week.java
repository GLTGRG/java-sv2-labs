package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {

    public static final List<String> days = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

    public static void main(String[] args) {
        System.out.println(days);
        days.set(1,"Wednesday");
        System.out.println(days);
    }

}
