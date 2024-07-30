package onlinecommercialbookstore;

import java.util.List;
import java.util.Objects;

public class BookSpec {
    private Publisher publisher;
    private Genre genre;
    private List<Author> authors; //one bookspec may have one or more authors

    public BookSpec(Publisher publisher, Genre genre, List<Author> authors) {
        this.publisher = publisher;
        this.genre = genre;
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BookSpec bookSpec = (BookSpec) obj;
        return Objects.equals(publisher, bookSpec.publisher) &&
               genre == bookSpec.genre &&
               Objects.equals(authors, bookSpec.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisher, genre, authors);
    }
}
