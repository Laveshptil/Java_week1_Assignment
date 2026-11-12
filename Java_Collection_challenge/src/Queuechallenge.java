import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Main class
public class Queuechallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //create a Queue to store customer names
        Queue<String> customers = new LinkedList<>();

        int choice;

        do {
            System.out.println("\n--- Customer Queue ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. View First Customer");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    customers.add(name);
                    System.out.println("Customer added successfully");
                    break;

                case 2:
                    if (customers.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Removed Customer: "
                                + customers.remove());
                    }
                    break;

                case 3:
                    if (customers.isEmpty()) {
                        System.out.println("No customers in queue.");
                    } else {
                        System.out.println("First Customer: "
                                + customers.peek());
                    }
                    break;

                case 4:
                    if (customers.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Customer Queue:");
                        for (String customer : customers) {
                            System.out.println(customer);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank you! Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
    
