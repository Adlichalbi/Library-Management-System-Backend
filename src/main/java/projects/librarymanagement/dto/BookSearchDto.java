package projects.librarymanagement.dto;

public class BookSearchDto {
    private String title;
    private String author;
    private String genre;
    private Boolean availableOnly;

    public BookSearchDto() {};

    public BookSearchDto(String title, String author, String genre, Boolean availableOnly) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availableOnly = availableOnly;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getAvailableOnly() {
        return availableOnly;
    }

    public void setAvailableOnly(Boolean availableOnly) {
        this.availableOnly = availableOnly;
    }

    // Utility methods to check if search criteria are provided
    public boolean hasTitle() {
        return title != null && !title.trim().isEmpty();
    }

    public boolean hasAuthor() {
        return author != null && !author.trim().isEmpty();
    }

    public boolean hasGenre() {
        return genre != null && !genre.trim().isEmpty();
    }

    public boolean hasAnyCriteria() {
        return hasTitle() || hasAuthor() || hasGenre();
    }

    public boolean isAvailableOnlySearch() {
        return availableOnly != null && availableOnly;
    }

    @Override
    public String toString() {
        return "BookSearchDto{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", availableOnly=" + availableOnly +
                '}';
    }
}
