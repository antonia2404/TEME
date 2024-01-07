public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780142437354");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book3 = new Book("1984", "George Orwell", "9780451524935");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.deleteBook(book2);

        library.displayBooks();
    }
}