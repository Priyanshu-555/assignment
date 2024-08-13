import java.util.*;
class Middle14{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
double p=sc.nextDouble();
System.out.println("Enter number: ");
double q=sc.nextDouble();
System.out.println("Enter number: ");
double r1=sc.nextDouble();
big(p,q,r1);

}

public static void  big(double a ,double b, double c){
if(a>b&&a<c||a<b&&a>c)
System.out.println("middle "+ a);
else if(b>a&&b<c||b<a&&b>c)
System.out.println("middle " + b); 
else 
System.out.println("middle " + c); 

}

}
