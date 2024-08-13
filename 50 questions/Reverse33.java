import java.util.*;
class Reverse33{		

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
int r=sc.nextInt();

 int av = digisum(r);
System.out.println("reverse"+av);



}
public static int digisum(int r){
int sum=0;
while(r>0){
sum +=sum*10+n%10;

n/=10;
}

return sum;
}
}
