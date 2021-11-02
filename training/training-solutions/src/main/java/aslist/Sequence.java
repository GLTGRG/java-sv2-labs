package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList(Arrays.asList(1, 10));

        for (int i = 2; i < 5; i++){
            int num = elements.get(i-2)* elements.get(i-1);
            elements.add(num);
        }

        System.out.println(elements);
        System.out.println(elements.size());
    }
}
