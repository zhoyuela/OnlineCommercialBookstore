package onlinecommercialbookstore;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Book> books;

    public Inventory() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book getBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> search(BookSpec searchSpec) {
        List<Book> matchingBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getSpec().equals(searchSpec)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
}
