public class Book {
    private String bookId;
    private String title;
    private Author author;
    private Category category;
    private boolean isAvailable;

    public Book(String bookId, String title, Author author, Category category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isAvailable = true; // Default availability
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void addBook() {
        // Logic to add book to the system
    }

    public void updateBook() {
        // Logic to update book information
    }

    public void deleteBook() {
        // Logic to delete book from the system
    }
}