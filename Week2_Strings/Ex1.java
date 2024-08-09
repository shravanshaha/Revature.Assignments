//1. Write a program to check if the letter 'e' is present in the word 'Umbrella'.

public class Ex1 {
    public static void main(String[] args) {
        String word = "Umbrella";
        boolean containsE = word.contains("e");
        System.out.println("Does the word contain 'e'? " + containsE);
    }
}
