
/*Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers*/
package Day2.Assign;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double product = 1;
        int count = 0;

        while (true) {
            System.out.print("Enter an digit or press q to quit : ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                product *= number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }

        scanner.close();

        if (count > 0) {
            double average = sum / count;
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
