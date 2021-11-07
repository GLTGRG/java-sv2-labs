package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {

    public static void main(String[] args) {

        List<String> names = new ArrayList(Arrays.asList("csoki", "eper", "citrom"));
        StringBuilder sb = new StringBuilder();
            for (int i = 0; i < names.size(); i++) {
                sb.append(names.get(i));
                if (i != (names.size() - 1)) {
                    sb.append(", ");
                }
            }
        System.out.println("csak ma gyerekeknek féláron kapható: " + sb + " fagyi!");
    }
}
