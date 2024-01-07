import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    public void deleteBook(Book book) {
        if (bookList.remove(book)) {
            System.out.println("Book removed from the library: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library: " + book.getTitle());
        }
    }

    public void displayBooks() {
        System.out.println("\nBooks in the library:");
        for (Book book : bookList) {
            System.out.println("Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor() +
                    ", ISBN: " + book.getISBN());
        }
    }
}
