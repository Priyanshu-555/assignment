import java.util.*;
class Digi_avg31{		

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
int r=sc.nextInt();

 int av = digisum(r);
System.out.println("average "+av);



}
public static int digisum(int r){
int i=1, t =n, sum=0,cnt=0;
while(r>0){
sum +=sum+n%10;
cnt++;

n/=10;
}

return sum/cnt;
}
}
