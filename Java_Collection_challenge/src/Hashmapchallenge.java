import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmapchallenge {

    public static void main(String[] args) {
        //create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        //create a Hashmap to store student id and name
        HashMap<Integer, String> students = new HashMap<>();

        int choice;

        do {
            System.out.println("\n Student Management System ");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student Name");
            System.out.println("4. Check Student ID");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    students.put(id, name);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Student ID to search: ");
                    id = sc.nextInt();

                    if (students.containsKey(id)) {
                        System.out.println("Student Name: "
                                + students.get(id));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    if (students.containsKey(id)) {
                        System.out.print("Enter New Name: ");
                        name = sc.nextLine();

                        students.put(id, name);
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student ID not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();

                    if (students.containsKey(id)) {
                        System.out.println("Student ID exists.");
                    } else {
                        System.out.println("Student ID does not exist.");
                    }
                    break;

                case 5:
                    if (students.isEmpty()) {
                        System.out.println("No student records available.");
                    } else {
                        System.out.println("\nStudent Records:");

                        for (Map.Entry<Integer, String> student
                                : students.entrySet()) {

                            System.out.println("ID: " + student.getKey()
                                    + ", Name: " + student.getValue());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Thank you! Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
    
