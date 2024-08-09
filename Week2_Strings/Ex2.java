//2.Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your //name is Robert Brett Roser, then the output should be R.B.Roser.


import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        String abbreviatedName = "";

        for (int i = 0; i < names.length - 1; i++) {
            abbreviatedName += names[i].charAt(0) + ".";
        }
        abbreviatedName += names[names.length - 1];

        System.out.println("Abbreviated name: " + abbreviatedName);
    }
}
