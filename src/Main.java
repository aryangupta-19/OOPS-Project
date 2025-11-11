import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        int choice;

        do {
            System.out.println("   *********  Student Report Card Generator    ");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Reports");
            System.out.println("3. Search by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> sm.addStudent();
                case 2 -> sm.displayAll();
                case 3 -> sm.searchByRoll();
                case 4 -> System.out.println("ENDED////!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }
}

