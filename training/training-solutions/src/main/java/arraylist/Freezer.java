package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> food = new ArrayList<>();

        food.add("beef");
        food.add("pork");
        food.add("fish");
        food.add("chicken");
        food.add("soup");

        System.out.println(food);
        System.out.println(food.size());


        food.remove(0);
        food.remove(1);

        System.out.println(food);
        System.out.println(food.size());
    }
}
