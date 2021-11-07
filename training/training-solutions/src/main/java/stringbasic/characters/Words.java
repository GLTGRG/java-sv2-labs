package stringbasic.characters;

import java.util.Arrays;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy szót!");
        String word = scanner.nextLine();

        System.out.println("Betűzze le az alábbi szót: " + word);

        char[] chars = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            String letters = scanner.nextLine();
            chars[i] = letters.toCharArray()[0];
        }

        System.out.println("A beírt betűk: " + Arrays.toString(chars));
        String result = new String(chars);

        if (result.equals(word)) {
            System.out.println("Helyes a megoldás!");
        } else {
            System.out.println("Helytelen megoldás!");
        }
    }
}
