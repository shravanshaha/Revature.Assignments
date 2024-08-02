/*Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
HINT : 
maximum difference = higest-lowest
minimum difference = second lowest - lowest*/

package Day2.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Ex8 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        Arrays.sort(arr);

	        System.out.println("Maximum difference: " + (arr[n - 1] - arr[0]));
	        System.out.println("Minimum difference: " + (arr[1] - arr[0]));

}
}


