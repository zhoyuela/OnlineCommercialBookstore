package onlinecommercialbookstore;

/**
 * Declare a publisher with an ID and name.
 */

public class Publisher {
    private String publisherId;
    private String publisherName;

    public Publisher(String publisherId, String publisherName) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
    }

    // Getters and setters for publisher's ID and name
    
    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
