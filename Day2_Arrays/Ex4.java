//Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.

package Day2.Arrays;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int [] arr1=new int[5];
		int [] arr2=new int[5];
		System.out.println("Enter 10 integers : ");
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Original Array : " );
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i=arr1.length-1; i>=0; i--) {
			arr2[i]=arr1[i];
		}
		System.out.println("Reversed Array : ");
		for(int i=arr1.length-1; i>=0; i--) {
			System.out.println( arr2[i]);
		}

	}

}
