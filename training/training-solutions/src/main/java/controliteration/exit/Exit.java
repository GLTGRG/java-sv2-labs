package controliteration.exit;

import java.util.Scanner;

public class Exit {

    private Scanner inputScanner = new Scanner(System.in);

    public void ezAmugyMainLenne() {
        boolean isExitNotAllowed = true;

        do {
            System.out.println("Az ugyfelszolgalat menuje jelenleg nem elerheto. Kilepes az X billentyu megnyomasaval");
            String exitKey = inputScanner.nextLine();

            if(exitKey.toLowerCase().equals("x")) {
                isExitNotAllowed = false;
            }

        } while(isExitNotAllowed);

        if(!isExitNotAllowed) {
            System.exit(404);
        }
    }
}
