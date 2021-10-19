package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Daniel Defoe","Robinson Crusoe");
        book.register(2623985);
        System.out.println("Author:" + " " + book.getAuthor() + " " + "Title:" + " " + book.getTitle() + " " + "Registration number:" + book.getRegNumber());
    }
}
