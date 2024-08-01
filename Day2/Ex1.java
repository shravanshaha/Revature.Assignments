package Day2;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth : ");
		double length=sc.nextInt();
		double breadth=sc.nextInt();
		
		if (length==breadth) {
			System.out.println("It is a Square ");
		}
		else {
			System.out.println("It is not a square");
		}
	}
	
	

}
