import java.util.Scanner;

public class D1e4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks in subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks in subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks in subject 3: ");
        int subject3 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3;
        double percentage = (double) totalMarks / 300 * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
