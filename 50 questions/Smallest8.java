import java.util.*;
class Smallest8{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
double r=sc.nextDouble();
System.out.println("Enter number: ");
double s=sc.nextDouble();
big(r, s);

System.out.println("Enter number: ");
double p=sc.nextDouble();
System.out.println("Enter number: ");
double q=sc.nextDouble();
System.out.println("Enter number: ");
double r1=sc.nextDouble();
big(p,q,r1);


System.out.println("Enter number: ");
double p2=sc.nextDouble();
System.out.println("Enter number: ");
double q2=sc.nextDouble();
System.out.println("Enter number: ");
double r2=sc.nextDouble();
System.out.println("Enter number: ");
double s2=sc.nextDouble();
big(p2,q2,r2,s2);



}

public static void  big(double a ,double b){
String r =a<b ?" smallest": "smallest";
if(a<b)
System.out.println("smallest"+ a);
else
System.out.println("smallest" + b); 

}
public static void  big(double a ,double b, double c){
if(a<b&&a<c)
System.out.println("smallest"+ a);
else if(b<a&&b<c)
System.out.println("smallest" + b); 
else 
System.out.println("smallest" + c); 

}

public static void  big(double a ,double b, double c, double d){
if(a<b&&a<c&&a<d)
System.out.println("smallest"+ a);
else if(b<a&&b<c&&b<d)
System.out.println("smallest" + b); 
else if(c<a&&c<b&&c<d) 
System.out.println("smallest" + c); 
else
System.out.println("smallest" + d); 




}


}
