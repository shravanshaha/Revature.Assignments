package Day2.Arrays;

public class Ex6 {

    public static void main(String[] args) {

        int[][] array = {
                {10, 12, 13},
                {42, 25, 6},
                {71, 18, 92}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
