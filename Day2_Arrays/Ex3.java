/*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s*/

package Day2.Arrays;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		System.out.println("Enter 5 integers : ");
		int positive=0;
		int negative=0;
		int odd=0;
		int even=0;
		int zero=0;
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>0) {
				positive++;
			}
			else if(arr[i]<0) {
				negative++;
			}
			else if(arr[i] % 2 == 0) {
				even++;
			}
			else if(arr[i] % 2 != 0) {
				odd++;
			}
			else if(arr[i] == 0) {
				zero++;
			}
			else {
				System.out.println("Invalid Input");
			}
		}
		System.out.println("Positive Numbers : "+ positive);
		System.out.println("Negative Numbers : "+ negative);
		System.out.println("Even Numbers : "+ even);
		System.out.println("Odd Numbers : "+ odd);
		System.out.println("Number of Zeros : "+ zero);
	}

}
