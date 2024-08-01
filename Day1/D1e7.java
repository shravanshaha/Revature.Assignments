public class D1e7 {
    public static void main(String[] args) {
        int totalStudents = 90;
        int totalBoys = 45;
        int totalGirls = totalStudents - totalBoys;

        int totalGradeA = (int) (totalStudents * 0.5);
        int boysWithGradeA = 20;
        int girlsWithGradeA = totalGradeA - boysWithGradeA;

        System.out.println("Total number of girls getting grade A: " + girlsWithGradeA);
    }
}
