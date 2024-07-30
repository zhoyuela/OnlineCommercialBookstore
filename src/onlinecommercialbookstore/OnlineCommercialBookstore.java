/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlinecommercialbookstore;

/**
 *
 * @author Yuelan Zhou
 */


import java.util.List;
import java.util.Arrays;

public class OnlineCommercialBookstore {
    
    public static void main(String[] args) {
        // Initialize the inventory
        Inventory inventory = new Inventory();
        
        // Create two authors
        Author author1 = new Author("A1", "Author 1");
        Author author2 = new Author("A2", "Author 2");
        
        // Create two publishers
        Publisher publisher1 = new Publisher("P1", "Publisher 1");
        Publisher publisher2 = new Publisher("P2", "Publisher 2");
        
        // Create two bookspecs
        BookSpec spec1 = new BookSpec(publisher1, Genre.FICTION, Arrays.asList(author1, author2));
        BookSpec spec2 = new BookSpec(publisher2, Genre.DRAMA, Arrays.asList(author2));
        
        // Create two books
        Book book1 = new Book("1234567890", 19.99, spec1);
        Book book2 = new Book("0987654321", 9.99, spec2);
        
        // Add books to the inventory
        inventory.addBook(book1);
        inventory.addBook(book2);
        
        // Search for a book by ISBN
        Book foundBook = inventory.getBook("1234567890");
        if (foundBook != null) {
            System.out.println("Found book with ISBN 1234567890: " + foundBook.getISBN() + ", Price: " + foundBook.getPrice());
        } else {
            System.out.println("Book with ISBN 1234567890 not found.");
        }
        
        // search for books by BookSpec
        List<Book> foundBooks = inventory.search(spec1);
        System.out.println("Books found with the specified BookSpec:");
        for (Book book : foundBooks) {
            System.out.println("ISBN: " + book.getISBN() + ", Price: " + book.getPrice());
        }
    }
}
