//Take 10 integer inputs from user and store them in an array. Again ask user to give a number. 
//Now, tell user whether that number is present in array or not.

package Day2.Arrays;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[10];
		System.out.println("Enter 10 integers : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter an element to check :");
		int num=sc.nextInt();
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
		if (arr[i]==num) {
			found=true;
			break;
		}
	}
		if(found) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}

