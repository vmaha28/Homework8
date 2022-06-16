package fastrack.com.Exercise4;

public class Students {
    private String name;
    private double grade;
    private static double sum;
    private static int studentNr;

    public Students(String name, int grade) {
        this.name = name;
        this.grade = (double)grade;
        ++studentNr;
        sum += (double)grade;
    }

    public String getName() {
        return this.name;
    }

    public double getGrade() {
        return this.grade;
    }

    public static double average() {
        return sum / (double)studentNr;
    }
}
