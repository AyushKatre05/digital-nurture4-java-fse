package dto;

public class BookResponse {
    private Long id;
    private String title;
    private String author;
    private String message;

    public BookResponse(Long id, String title, String author, String message) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.message = message;
    }

    // Getters only
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getMessage() { return message; }
}
