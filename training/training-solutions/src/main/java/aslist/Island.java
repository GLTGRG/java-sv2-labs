package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {

    public static void main(String[] args) {
    List<String> importantThings = Arrays.asList("matches", "knife", "book");
    System.out.println(importantThings);

    importantThings.set(2, "Ebook");
    System.out.println(importantThings);
    }
}
