import java.util.Scanner;

public class D1e8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();

        int firstDigit = number / 10000;
        int secondLastDigit = (number % 100) / 10;
        int sum = firstDigit + secondLastDigit;

        System.out.println("The sum of the first and second last digits is: " + sum);
    }
}
