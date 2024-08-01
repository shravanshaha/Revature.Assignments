

public class A1e5{
public static void main(String[] args){
int num1=10, num2=20, num3=30;

int greatest=num1;
greatest=(num2 > greatest)? num2 : greatest;
greatest=(num3 > greatest)? num3 : greatest;

System.out.println("Greatest : "+ greatest);

}}
