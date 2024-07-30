package onlinecommercialbookstore;

public class Book {
    private String ISBN;
    private double price;
    private BookSpec spec;

    public Book(String ISBN, double price, BookSpec spec) {
        this.ISBN = ISBN;
        this.price = price;
        this.spec = spec;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookSpec getSpec() {
        return spec;
    }

    public void setSpec(BookSpec spec) {
        this.spec = spec;
    }
}

