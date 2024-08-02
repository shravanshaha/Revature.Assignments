//Write a program to find the sum and product of all elements of an array.

package Day2.Arrays;


public class Ex5 {
	public static void main(String[]args) {
	int[] arr = {1 , 2 , 3 , 4 , 5 };
	int sum=0;
	int product=1;
	
	for (int i=0; i<arr.length; i++) {
		sum=sum+arr[i];
		product=product*arr[i];
	}
	System.out.println("Sum : " + sum);
	System.out.println("Product :"+ product);
	}

}
