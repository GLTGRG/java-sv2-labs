package math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Henry Bryant", "Kathryn Thomas", "Jeremy Rogers", "Lois Adams", "Cheryl Baker", "Amanda Davis", "Brenda Wood", "Wanda Torres", "Daniel Gonzalez", "Emily Henderson");

        Random random = new Random();
        int first = random.nextInt(5);
        int second = random.nextInt(5)+5;


        RandomDraw randomDraw = new RandomDraw();

        System.out.println("First winner: " + names.get(first));
        System.out.println("Second winner: " + names.get(second));
    }
}
