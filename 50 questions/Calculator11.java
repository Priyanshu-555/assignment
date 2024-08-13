import java.util.*;
class Calculator11{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
int a=sc.nextInt();
System.out.println("Enter number: ");
int b=sc.nextInt();

System.out.println("Enter operator: ");
char r=sc.nextChar();


if(r==+&&r!=0)
System.out.println(a+b);
else if(r=='-'&&r!=0)
System.out.println(a-b);
else if(r=='*'&&r!=0)
System.out.println(a*b);
else if(r=='/'&&r!=0)
System.out.println(a/b);
else 
System.out.println("invalid");




}
}
