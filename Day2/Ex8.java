/*A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.*/

package Day2.Assign;

public class Ex8 {
	public static void main(String[]args) {
		
		for(int i=100; i<=500; i++) {
			int cube=0;
			int sum=0;
			int original=i;
			
		while(original!=0) {
			int digit=original%10;
			cube=digit*digit*digit;
	    sum=sum+cube;
	    original/=10;
		}
	    if(sum==i) {
	    	System.out.println(i);
	    }
		}	
	}
}
