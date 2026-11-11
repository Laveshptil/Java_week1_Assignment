import java.util.Scanner;

public class Bankingapp {

    private BankAccount account;
    private Scanner scanner;

    public Bankingapp() {
        account = new BankAccount(10000);
        scanner = new Scanner(System.in);
    }

    public void start() {

        int choice = 0;

        System.out.println("");
        System.out.println("     WELCOME TO BANKING APP");
        System.out.println("");

        while (choice != 4) {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount =
                            Double.parseDouble(scanner.nextLine());

                        account.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount =
                            Double.parseDouble(scanner.nextLine());

                        account.withdraw(withdrawAmount);
                        break;

                    case 3:
                        System.out.printf(
                            "Current Balance: %.2f%n",
                            account.getBalance()
                        );
                        break;

                    case 4:
                        System.out.println(
                            "Thank you for using Banking app!"
                        );
                        break;

                    default:
                        System.out.println(
                            "Invalid choice! Please select 1 to 4."
                        );
                }

            } catch (NumberFormatException e) {
                System.out.println(
                    "Invalid input! Please enter a numeric value."
                );

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
    

