import java.util.*;
class valid20{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter day: ");
int d=sc.nextInt();

System.out.println("Enter Month: ");
int m=sc.nextInt();

System.out.println("Enter year: ");
int y=sc.nextInt();

if(d<1||d>31||m<1||m>12||y<0)
System.out.println("Invalid");
else if((m==4||m==6||m==9||m==11)&&d>30)
System.out.println("Invalid");
else if(m==2&&m>29)
System.out.println("Invalid");
else if((y%4==0&&y%100!=0||y%400==0 )==false && m==2&&d>28 )
System.out.println("Invalid");
else
System.out.println("Valid");

}
}
