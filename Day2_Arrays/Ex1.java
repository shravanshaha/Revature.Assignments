// Take 10 integer inputs from user and store them in an array and print them on screen.
package Day2.Arrays;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[10];
		System.out.println("Enter 10 integers : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}
	}

}
