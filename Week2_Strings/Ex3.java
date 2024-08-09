//Write a program to find the number of vowels, consonents, digits and white space characters in a string.


public class Ex3 {
    public static void main(String[] args) {
        String str = "Shravan, shaha. 123";
        int vowels = 0, consonants = 0, digits = 0, whitespace = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                whitespace++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Whitespace: " + whitespace);
    }
}


