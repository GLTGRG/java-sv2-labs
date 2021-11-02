package looptypesmodify;

import java.util.Arrays;

public class EveryThirdMain {

    public static void main(String[] args) {
        EveryThird everyThird = new EveryThird();

        int[] numbers = new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3};

        everyThird.changeToZero(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
