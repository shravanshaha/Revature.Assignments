/*Find GCD */
		
package Day2.Assign;
import java.util.Scanner;

public class Ex7 {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enetr two numbers ");
		  int n1=sc.nextInt();
		  int n2=sc.nextInt();
	    int gcd = 1;

	    for (int i = 1; i <= n1 && i <= n2; ++i) {
	      if (n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }

	    System.out.println("GCD is : " + gcd);
	  }
	}