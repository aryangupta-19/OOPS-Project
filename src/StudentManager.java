import java.util.*;

public class StudentManager {

    private ArrayList<ReportCard> students = new ArrayList<>(); 

    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Marks in Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        sc.nextLine(); 
        ReportCard rc = new ReportCard(name, roll, marks);
        
        students.add(rc);
        System.out.println("Student added successfully!\n");
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.\n");
            return;
        }
        for (ReportCard r : students){
            r.generateReport();
        }
    }

    public void searchByRoll() {
        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();
        for (ReportCard r : students) {
            if (r.getRollNo() == roll) {
                r.generateReport();
                return;  
            }
        }
        System.out.println("Student not found!\n");
    }
}