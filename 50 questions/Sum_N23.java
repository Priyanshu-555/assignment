import java.util.*;
class Sum_N23{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
int r=sc.nextInt();

int i=1, sum=0;
while(i<=r){

sum+=i;
i++;
}
System.out.println("sum"+ sum);
}
}
