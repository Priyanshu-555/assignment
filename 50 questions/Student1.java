import java.util.*;
class Student{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter Name: ");
String name=sc.nextLine();

System.out.println("Enter mobile no : ");
long no=sc.nextLong();

System.out.println("Enter 10 th: ");
float tn=sc.nextFloat();

System.out.println("Enter 12 th: ");
float tw=sc.nextFloat();

System.out.println("Degree: ");
float dg = sc.nextFloat();

System.out.println("\n\nName: "+name);
System.out.println("Mobile Number: "+no);
System.out.println("10th: "+tn);
System.out.println("12th: "+tw);
System.out.println("Degree: "+dg);

}
}
