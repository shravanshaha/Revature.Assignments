public class D1e5_1 {
    public static void main(String[] args) {
        int a = 6, b = 8;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
