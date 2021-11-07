package stringconcat.nameconcat;

public class NameMain {

    public static void main(String[] args) {
        Name name = new Name("Galát", "J.", "Gergő",Title.MR);

        System.out.println(name.concatNameHungarianStyle());
        System.out.println(name.concatNameWesternStyle());
    }
}
