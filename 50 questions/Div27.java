import java.util.*;
class Div27{		

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
int r=sc.nextInt();

int i=1, sum=0;
while(i<=r/2){

if(r%i==0&&r!=0)
System.out.println(i);
i++;
}

}
}
