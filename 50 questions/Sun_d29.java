import java.util.*;
class Sum_d29{		

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
int r=sc.nextInt();

int sum = sum(r);
System.out.println("sum"+ sum);

}

public static int sum(int r){
int i=1, sum=0;
while(r!=0){

sum+=r%10;
r/=10;
}
return sum;
}
}
