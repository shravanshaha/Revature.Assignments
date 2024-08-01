public class A1e2{
public static void main(String[] args){
int a=20;
int b=10;

second.add(a,b);
second.sub(a,b);
second.mul(a,b);
second.div(a,b);
}
}


class second{

public static void add(int a, int b){
System.out.println(a+b);
}

public static void sub(int a, int b){
System.out.println(a-b);
}

public static void mul(int a, int b){
System.out.println(a*b);
}

public static void div(int a, int b){
System.out.println(a/b);
}

}