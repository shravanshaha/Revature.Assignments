package Day2;
import java.util.Scanner;

public class Ex2 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks :");
		int marks=sc.nextInt();
		
		if(marks<25) {
			System.out.println("F");
		}
		else if (marks >= 25 && marks < 45) {
			System.out.println("E");
		}
		else if(marks >= 45 &&  marks < 50) {
			System.out.println("D");
		}
		else if(marks >= 50 &&  marks < 60) {
			System.out.println("C");
		}
		else if(marks >= 60 &&  marks < 80) {
			System.out.println("B");
		}
		else {
			System.out.println("A");
		}
	}

}
