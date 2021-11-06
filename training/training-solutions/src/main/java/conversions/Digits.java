package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void addDigitsToList(String text) {
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                String digitString = Character.toString(c);
                int number = Integer.parseInt(digitString);
                numbers.add(number);
            }
        }
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("j4g5jk23h5gjk2");
        System.out.println(digits.getNumbers());


    }

}
