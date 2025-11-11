public class Student {
    
    private String name;
    private int rollNo;
    private int[] marks; 

    public Student(String name, int rollNo, int[] marks) {
       this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    public double calculateAverage() {
        int sum=0;
        for (int m: marks){ 
            sum += m;
        }
        return (double) sum / marks.length;
    }

    public char calculateGrade() {

        double avg = calculateAverage();

        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }

    public String getName(){
        return name; 
    }
    public int getRollNo(){
        return rollNo; 
    }
    public int[] getMarks(){
        return marks; 
    }
}