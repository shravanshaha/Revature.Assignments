import java.util.Scanner;

public class D1e10   
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);
int num = sc.nextInt();
 
int reverse = 0;  
while(number != 0)   
{  
int digit = num % 10;  
reverse = reverse * 10 + digit;  
num = num/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  