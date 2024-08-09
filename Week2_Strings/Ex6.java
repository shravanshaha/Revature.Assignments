import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        String[] friends = {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Henry", "Ivy", "Jack"};


        Arrays.sort(friends);


        System.out.println("Sorted names:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
