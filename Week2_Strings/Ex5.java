import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String modifiedString = replacePalindromeSubstrings(inputString);
        System.out.println("Modified string: " + modifiedString);
    }

    public static String replacePalindromeSubstrings(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);

        for (int i = 0; i < sb.length(); i++) {
            // Check for odd length palindromes
            int left = i - 1, right = i + 1;
            while (left >= 0 && right < sb.length() && sb.charAt(left) == sb.charAt(right)) {
                replacePalindrome(sb, left, right);
                left--;
                right++;
            }

            // Check for even length palindromes
            left = i;
            right = i + 1;
            while (left >= 0 && right < sb.length() && sb.charAt(left) == sb.charAt(right)) {
                replacePalindrome(sb, left, right);
                left--;
                right++;
            }
        }

        return sb.toString();
    }

    private static void replacePalindrome(StringBuilder sb, int left, int right) {
        for (int i = left; i <= right; i++) {
            sb.setCharAt(i, '*');
        }
    }
}
