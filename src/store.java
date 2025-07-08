import java.util.*;

public class store {
    private Map<String, Book> inventory = new HashMap<>();

    public void addbook(Book book) {
        inventory.put(book.getISBN(), book);
        System.out.println(" Book added " + book.getTitle());
    }

    public Book findbook(String isbn) {
        return inventory.get(isbn);
    }

    public Book removebook(int currentYear, int maxAge) {
        List<Book> books = new ArrayList<>(inventory.values());
         int booksize=books.size();
        for (int i = 0; i <booksize; i+=1) {
            Book book = books.get(i);
            int age = currentYear - book.getPubear();

            if (age > maxAge) {
                inventory.remove(book.getISBN());
                System.out.println("removed book done " + book.getTitle());
                return book;
            }
        }

        return null;
    }

}
