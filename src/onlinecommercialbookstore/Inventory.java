package onlinecommercialbookstore;

import java.util.ArrayList;
import java.util.List;

// list all books in stock
public class Inventory {
    private List<Book> books;

    //initialize the inventory, this is empty list
    
    public Inventory() {
        books = new ArrayList<>();
    }

    //function: add a book
    public void addBook(Book book) {
        books.add(book);
    }

    //function: remove a book
    public void removeBook(Book book) {
        books.remove(book);
    }

    //function: show a book, if available
    public Book getBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null; // Return null, if the book with given ISBN does't exist
    }

     // Searches for books that match the given BookSpec 
    public List<Book> search(BookSpec searchSpec) {
        List<Book> matchingBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getSpec().equals(searchSpec)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks; //return matching books
    }
}
