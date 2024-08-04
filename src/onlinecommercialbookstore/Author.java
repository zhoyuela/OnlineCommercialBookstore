package onlinecommercialbookstore;

/**
 * Declare an author with an ID and name.
 */

public class Author {
    private String authorId;
    private String authorName;

    public Author(String authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    // Getters and setters for author's ID and name
    
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
