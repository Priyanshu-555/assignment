import java.util.*;
class Days16{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter month number: ");
int r=sc.nextInt();

if(r==1&&r==3&&r==5&&r==7&&r==8&&r==10&&r==12)
System.out.println("31 days");
else if(r==2)
System.out.println("28/29 days ");
else 
System.out.println("30 days ");

}
}
