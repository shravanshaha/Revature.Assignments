/*a.
*
**
***
****

b.
1010101
 10101 
  101  
   1   */


package Day2.Assign;

public class Ex5 {
	public static void main(String[]args) {
		for (int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=3; i>=1; i--) {
			for(int j=1; j<=i;j++) {
				System.out.print("10");
			}
			System.out.println("1");
		}
		System.out.println("1");
	}

}
