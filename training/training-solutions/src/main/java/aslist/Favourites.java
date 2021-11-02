package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> favouriteThing = new ArrayList<>();

        System.out.println("What is your favorite movie?");
        favouriteThing.add(scanner.nextLine());

        System.out.println("Who is your favorite actor?");
        favouriteThing.add(scanner.nextLine());

        System.out.println("what is your favorite animal?");
        favouriteThing.add(scanner.nextLine());

        System.out.println(favouriteThing);
        System.out.println(favouriteThing.size());
    }
}
