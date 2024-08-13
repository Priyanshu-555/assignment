import java.util.*;
class Special18{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
int n=sc.nextInt();

int s=n%10;
int r=n/10;

if((r*s)+r+s==n)
System.out.println(" Special number");
else
System.out.println("not Special number ");

}
}
