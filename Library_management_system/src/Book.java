 public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;
    private String issuedTo;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.issuedTo = "";
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setIssuedTo(String name) {
        issuedTo = name;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " +
                (isAvailable ? "Available" : "Issued"));
        if (!isAvailable) {
            System.out.println("Issued To: " + issuedTo);
        }
        System.out.println("");
    }
}
    


    
