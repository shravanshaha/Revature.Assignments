/*3. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/

package Day2.Assign;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[]args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter total classes held : ");
	int classesHeld= sc.nextInt();
	System.out.println("Enter total classes Attended : ");
	int classesAttended=sc.nextInt();
	
	double attendence=(double) classesAttended/classesHeld * 100 ;
	System.out.println("Attendance : " + attendence + "%");

	System.out.println("Is there Medical reseason for your absence?(Y/N) : ");
	char reason=sc.next().charAt(0);
	if (reason=='Y') {
		System.out.println("You are allowed to sit");
	}
	else {
		System.out.println("You are not allowed to sit");
	}
	}
}

