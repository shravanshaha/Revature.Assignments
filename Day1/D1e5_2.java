public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 6, b = 8;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
