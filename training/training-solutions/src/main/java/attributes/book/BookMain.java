package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Murder on the Orient Express");

        System.out.println(book.getTitle());

        book.setTitle("Murder on the Orient Express - Agatha Christie");

        System.out.println(book.getTitle());
    }
}
