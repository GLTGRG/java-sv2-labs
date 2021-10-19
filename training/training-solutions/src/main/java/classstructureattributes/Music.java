package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite band!");
        song.band = scanner.nextLine();
        System.out.println("Enter the title of your favorite song from them!");
        song.title = scanner.nextLine();
        System.out.println("Enter the length of the song!");
        song.length = scanner.nextInt();
        System.out.println(song.band + " - " + song.title + " " + "(" + song.length + " minutes)");

    }
}
