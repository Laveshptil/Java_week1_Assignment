import java.util.ArrayList;

public class Library {
    

         private ArrayList<Book> books = new ArrayList<>();

         public void addBook(Book book) {
           for (Book b : books) {
            if (b.getBookId() == book.getBookId()) {
                System.out.println("Book ID already exists!");
                return;
              }
         }

         books.add(book);
         System.out.println("Book added successfully!");
        }
        


    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            b.displayBook();
        }
    }

    public void searchBook(String search) {
        boolean found = false;

        for (Book b : books) {
            if (String.valueOf(b.getBookId()).equals(search)
                    || b.getTitle().equalsIgnoreCase(search)) {
                b.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void issueBook(int id, String user) {
        for (Book b : books) {
            if (b.getBookId() == id) {
                if (b.isAvailable()) {
                    b.setAvailable(false);
                    b.setIssuedTo(user);
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }

        System.out.println("Book ID not found!");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getBookId() == id) {
                if (!b.isAvailable()) {
                    b.setAvailable(true);
                    b.setIssuedTo("");
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book is already available.");
                }
                return;
            }
        }

        System.out.println("Book ID not found!");
    }

    public void removeBook(int id) {
        for (Book b : books) {
            if (b.getBookId() == id) {
                if (b.isAvailable()) {
                    books.remove(b);
                    System.out.println("Book removed successfully!");
                } else {
                    System.out.println("Cannot remove an issued book.");
                }
                return;
            }
        }

        System.out.println("Book ID not found!");
    }
}


    
