import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistchallenge {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //create a Arraylist to store book names
        ArrayList<String> books = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n ARRAYLIST BOOK MANAGEMENT");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update Book");
            System.out.println("4. Search Book");
            System.out.println("5. Display Books");
            System.out.println("6. Exit");
            //perform operations based on the user's choice
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        System.out.print("Enter book name: ");
                        String book = sc.nextLine();

                        if (book.trim().isEmpty()) {
                            System.out.println("Book name cannot be empty.");
                        } else {
                            books.add(book);
                            System.out.println("Book added successfully.");
                        }
                        break;

                    case 2:
                        System.out.print("Enter book name to remove: ");
                        String remove = sc.nextLine();

                        if (books.remove(remove)) {
                            System.out.println("Book removed successfully.");
                        } else {
                            System.out.println("Book not found.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter old book name: ");
                        String oldBook = sc.nextLine();

                        int index = books.indexOf(oldBook);

                        if (index != -1) {
                            System.out.print("Enter new book name: ");
                            String newBook = sc.nextLine();

                            if (newBook.trim().isEmpty()) {
                                System.out.println("Book name cannot be empty.");
                            } else {
                                books.set(index, newBook);
                                System.out.println("Book updated successfully.");
                            }
                        } else {
                            System.out.println("Book not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter book name to search: ");
                        String search = sc.nextLine();

                        if (books.contains(search)) {
                            System.out.println("Book found!");
                        } else {
                            System.out.println("Book not found.");
                        }
                        break;

                    case 5:
                        System.out.println("\nAvailable Books:");

                        if (books.isEmpty()) {
                            System.out.println("No books available.");
                        } else {
                            for (String b : books) {
                                System.out.println(b);
                            }
                        }
                        break;

                    case 6:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                choice = 0;
            }

        } while (choice != 6);

        sc.close();
    }
}
    


    
