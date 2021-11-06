package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

    private List<String> books = new ArrayList<>();

    public void addBook(String title){
        books.add(title);
    }

    public List<String> getBooks() {
        return books;
    }

    public void findBookAndSetAuthor(String title, String author){
        for(int i = 0; i< books.size(); i++){
            if (title.equals(books.get(i))){
                books.set(i, author + ": " + title);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books books = new Books();

        System.out.print("Hány könyvcímet szeretne megadni?: ");
        int titledb=scanner.nextInt();
        scanner.nextLine();
        String title;
        for(int i=0;i<titledb;i++){
            System.out.print((i+1)+". cím: ");
            title= scanner.nextLine();
            books.addBook(title);
        }

        System.out.println(books.getBooks());

        System.out.print("Melyik könyvnek tudja a szerzőjét?\nAdja meg a címét: ");
        title=scanner.nextLine();

        System.out.print("Adja meg a szerzőt: ");
        String author=scanner.nextLine();

        books.findBookAndSetAuthor(title,author);

        System.out.println(books.getBooks());
    }

}


