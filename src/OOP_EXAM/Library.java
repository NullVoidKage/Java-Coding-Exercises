package OOP_EXAM;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Library {
    private Map<String, Book> books = new HashMap<>();
    Map<String, String> map = new ConcurrentHashMap<>();
    Map<String, String> getMap = new Hashtable<>();

    public void addBook(String title) {
//        map.entrySet();
        books.put(null, new Book(title));

        books.put(title, new Book(title));
    }


    public void borrowBook(String title) {
        Book book = books.get(title);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book not found");
        }
    }

    public void returnBook(String title) {
        Book book = books.get(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found");
        }
    }

    public void listBooks() {
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Great Gatsby");
        library.addBook("1984");

        library.listBooks();
        library.borrowBook("1984");
        library.listBooks();
        library.returnBook("1984");
        library.listBooks();
    }
}
