import java.util.*;
class Factorial24{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
int r=sc.nextInt();


int s= fact(n);
System.out.println("factorial  "+s);
}

public static int fact(int n){

int i=0 , fact=0;
while(i!=n){
fact*=(n-i);

i++;
}
return fact;


}

}
