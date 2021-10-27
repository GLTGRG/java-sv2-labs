package introcontrol;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Válasszon az alábbi menüpontök közül:");
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");
        int menuPont = scanner.nextInt();

        if (menuPont == 1) {
            System.out.println("Felhasználók listázása");
        }
        if (menuPont == 2) {
            System.out.println("Felhasználó felvétele");
        }
    }
}
