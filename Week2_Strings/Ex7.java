public class ex7 {
    public static void main(String[] args) {
        String sentence = "A batman with bat";
        String oldSubstring = "bat";
        String newSubstring = "snow";

        String newSentence = sentence.replaceAll(oldSubstring, newSubstring);

        System.out.println("New sentence: " + newSentence);
    }
}
