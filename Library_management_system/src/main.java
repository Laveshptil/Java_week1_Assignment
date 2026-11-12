import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    Book book = new Book(id, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID or Title: ");
                    String search = sc.nextLine();
                    library.searchBook(search);
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int issueId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter User Name: ");
                    String user = sc.nextLine();

                    library.issueBook(issueId, user);
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    int returnId = sc.nextInt();

                    library.returnBook(returnId);
                    break;

                case 6:
                    System.out.print("Enter Book ID: ");
                    int removeId = sc.nextInt();

                    library.removeBook(removeId);
                    break;

                case 7:
                    System.out.println("Thank you for using Library Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
    


    

