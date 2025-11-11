public class ReportCard extends Student {

    public ReportCard(String name, int rollNo, int[] marks){
        super(name, rollNo, marks);
    }

    public void generateReport() {

        System.out.println("\n----- Report Card -----");

        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());

        int[] marks = getMarks();

        for (int i = 0; i < marks.length; i++){
            System.out.println("Subject "  +  (i + 1)+": " + marks[i]);
        }

        System.out.println("Average: "+calculateAverage());
        System.out.println("Grade: "+ calculateGrade());
    }
}
