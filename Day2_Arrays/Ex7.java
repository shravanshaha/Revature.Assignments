// Find largest and smallest elements of an array.

package Day2.Arrays;

public class Ex7 {
	public static void main(String[] args) {
		int[] arr= {12, 14,34, 26, 57, 10};
		int small=arr[0];
		int large=arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]<small) {
			small=arr[i];
			}
			if (arr[i]>large) {
				large=arr[i];
				}
		}
		
		System.out.println("Smallest element :" + small);
		System.out.println("Largest element :" + large);
	
	}
}