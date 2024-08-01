 /*Take 10 integers from keyboard using loop and print their average value on the screen.*/
package Day2.Assign;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int [] num =new int[5];
		int sum=0;
		int avg=0;
		System.out.println("Enter 5 integers : ");
		for(int i=0; i<5; i++) {
		num[i]=sc.nextInt();
	   sum=sum+num[i];
		}
		System.out.println("Sum : " + sum);
	   avg=sum/5;
	   System.out.println("Average : " + avg);
		
	}

}