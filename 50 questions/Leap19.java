import java.util.*;
class Leap19{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter year: ");
int n=sc.nextInt();



if(n%400==0||n%4==0&&n%100!=0)
System.out.println(" leap year");
else
System.out.println("not leap year ");

}
}
