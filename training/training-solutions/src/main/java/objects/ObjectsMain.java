package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        new Book();
        System.out.println(new Book());

        Book emptyBook = null;
        System.out.println(emptyBook);

        if (emptyBook == null){
            System.out.println("emptyBook is null");
        }

        Book book = new Book();
        System.out.println(book);

        book = null;
        System.out.println(book);

        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();

        System.out.println(book == anotherBook);

        anotherBook = book;

        System.out.println(book == anotherBook);


        Book[] books ={new Book(), new Book(), new Book()};

        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());

        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(new Book());
        bookList2.add(new Book());
        bookList2.add(new Book());

        System.out.println(Arrays.toString(books));

        System.out.println(bookList);

        System.out.println(bookList2);
    }
}
