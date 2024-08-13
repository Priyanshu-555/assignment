import java.util.*;
class Product32{		

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
int r=sc.nextInt();
 int r=poduct(r);
System.out.println("product"+ r);

}
public static int product(int n)
int i=1, pr=0;
while(n>0){

pr*=n%10;
i++;
n/=10;
}
return pr;
}
}
